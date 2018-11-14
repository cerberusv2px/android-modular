package com.sujin.modularfirst.di.provider

import com.sujin.comments.di.provider.CommentsActivityBindingModule
import com.sujin.posts.di.provider.PostsActivityBindingModule
import dagger.Module

@Module(
    includes = [(PostsActivityBindingModule::class), (CommentsActivityBindingModule::class)])
abstract class ActivityBindingModule {

    // Sample
    /*@PerActivity
    @ContributesAndroidInjector(modules = [(MainActivityModule::class), (MainActivityBindingModule::class)])
    abstract fun bindMainActivity(): MainActivity*/
}