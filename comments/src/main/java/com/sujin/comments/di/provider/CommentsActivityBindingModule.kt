package com.sujin.comments.di.provider

import com.sujin.comments.di.scope.PerActivity
import com.sujin.comments.ui.CommentsActivity
import com.sujin.comments.ui.CommentsModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class CommentsActivityBindingModule {

    @PerActivity
    @ContributesAndroidInjector(modules = [(CommentsModule::class)])
    abstract fun bindCommentActivity(): CommentsActivity
}