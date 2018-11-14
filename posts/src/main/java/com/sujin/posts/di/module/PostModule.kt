package com.sujin.posts.di.module

import com.sujin.common.SchedulersFactory
import com.sujin.disk.DatabaseManager
import com.sujin.posts.data.local.PostLocalImpl
import com.sujin.posts.data.remote.PostRemoteImpl
import com.sujin.posts.data.remote.PostService
import com.sujin.posts.domain.PostRepository
import com.sujin.posts.domain.PostRepositoryImpl
import dagger.Module
import dagger.Provides

@Module
class PostModule {

    @Provides
    fun providePostLocal(databaseManager: DatabaseManager): PostRepository.Local {
        return PostLocalImpl(databaseManager)
    }

    @Provides
    fun providePostRepository(
        schedulersFactory: SchedulersFactory,
        postLocal: PostRepository.Local,
        postRemote: PostRepository.Remote
    ): PostRepositoryImpl {
        return PostRepositoryImpl(schedulersFactory, postLocal, postRemote)
    }

    @Provides
    fun providePostRemote(postService: PostService): PostRepository.Remote {
        return PostRemoteImpl(postService)
    }
}