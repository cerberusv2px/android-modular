package com.sujin.posts.di.module

import com.sujin.common.di.module.CommonApplicationModule
import dagger.Module

@Module(
    includes = [
        (CommonApplicationModule::class),
        (PostModule::class)
    ]
)
class PostApplicationModule {

}