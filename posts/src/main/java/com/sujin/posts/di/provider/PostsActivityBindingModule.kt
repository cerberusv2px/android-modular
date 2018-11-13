package com.sujin.posts.di.provider

import com.sujin.comments.di.provider.CommentsActivityBindingModule
import com.sujin.comments.di.scope.PerActivity
import com.sujin.posts.ui.posts.PostsActivity
import com.sujin.posts.ui.posts.PostsModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module(includes = [CommentsActivityBindingModule::class])
abstract class PostsActivityBindingModule {

    @PerActivity
    @ContributesAndroidInjector(modules = [(PostsModule::class)])
    abstract fun bindPostActivity(): PostsActivity
}