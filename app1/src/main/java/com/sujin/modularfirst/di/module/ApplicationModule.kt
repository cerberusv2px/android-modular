package com.sujin.modularfirst.di.module

import com.sujin.common.di.module.CommonApplicationModule
import com.sujin.posts.di.module.PostApplicationModule
import dagger.Module

@Module(
    includes = [
        // ApiModule::class  *Sample. include other modules*
        PostApplicationModule::class
        //CommonApplicationModule::class
    ]
)
open class ApplicationModule {


}