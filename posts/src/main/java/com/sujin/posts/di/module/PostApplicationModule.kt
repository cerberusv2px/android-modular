package com.sujin.posts.di.module

import com.sujin.common.di.module.CommonApplicationModule
import com.sujin.common.di.scope.PerApplication
import com.sujin.common.di.scope.PerModule
import com.sujin.posts.data.remote.PostService
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit

@Module(
    includes = [
        (CommonApplicationModule::class),
        (PostModule::class)
    ]
)
class PostApplicationModule {

    @Provides
    @PerApplication
    fun postService(retrofit: Retrofit): PostService = retrofit.create(PostService::class.java)
}