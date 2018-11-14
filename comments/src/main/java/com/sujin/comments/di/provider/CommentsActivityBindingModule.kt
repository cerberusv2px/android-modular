package com.sujin.comments.di.provider


import com.sujin.comments.ui.CommentsActivity
import com.sujin.comments.ui.CommentsModule
import com.sujin.common.di.scope.PerActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class CommentsActivityBindingModule {

    @PerActivity
    @ContributesAndroidInjector(modules = [(CommentsModule::class)])
    abstract fun bindCommentActivity(): CommentsActivity
}