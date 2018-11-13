package com.sujin.app2.di.provider

import com.sujin.posts.di.provider.PostsActivityBindingModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module(includes = [PostsActivityBindingModule::class])
abstract class ActivityBindingModule {

    // Sample
    /*@PerActivity
    @ContributesAndroidInjector(modules = [(MainActivityModule::class), (MainActivityBindingModule::class)])
    abstract fun bindMainActivity(): MainActivity*/
}