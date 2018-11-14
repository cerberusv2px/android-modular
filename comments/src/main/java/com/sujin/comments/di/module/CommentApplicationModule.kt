package com.sujin.comments.di.module

import com.sujin.common.di.module.CommonApplicationModule
import dagger.Module

@Module(includes = [(CommonApplicationModule::class)])
class CommentApplicationModule {
}