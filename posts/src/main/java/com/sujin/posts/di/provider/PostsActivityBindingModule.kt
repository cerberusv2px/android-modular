package com.sujin.posts.di.provider

import com.sujin.modularfirst.di.scope.PerActivity
import com.sujin.posts.ui.PostsActivity
import com.sujin.posts.ui.PostsModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class PostsActivityBindingModule {

    @PerActivity
    @ContributesAndroidInjector(modules = [(PostsModule::class)])
    abstract fun bindPostActivity(): PostsActivity
}