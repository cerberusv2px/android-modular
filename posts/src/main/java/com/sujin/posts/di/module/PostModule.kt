package com.sujin.posts.di.module

import com.sujin.common.utils.SchedulersFactory
import com.sujin.common.di.scope.PerApplication
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
    @PerApplication
    fun providePostLocal(databaseManager: DatabaseManager): PostRepository.Local {
        return PostLocalImpl(databaseManager)
    }

    @Provides
    @PerApplication
    fun providePostRepository(
        schedulersFactory: SchedulersFactory,
        postLocal: PostRepository.Local,
        postRemote: PostRepository.Remote
    ): PostRepositoryImpl {
        return PostRepositoryImpl(schedulersFactory, postLocal, postRemote)
    }

    @Provides
    @PerApplication
    fun providePostRemote(postService: PostService): PostRepository.Remote {
        return PostRemoteImpl(postService)
    }
}