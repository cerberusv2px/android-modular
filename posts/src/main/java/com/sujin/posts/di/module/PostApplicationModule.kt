package com.sujin.posts.di.module

import com.sujin.common.di.module.ApiModule
import com.sujin.common.di.module.CommonApplicationModule
import com.sujin.posts.data.remote.PostService
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import javax.inject.Singleton

@Module(
    includes = [
        (CommonApplicationModule::class),
        //(ApiModule::class),
        (PostModule::class)
    ]
)
class PostApplicationModule {

    @Provides
    //@Singleton
    fun postService(retrofit: Retrofit): PostService = retrofit.create(PostService::class.java)
}