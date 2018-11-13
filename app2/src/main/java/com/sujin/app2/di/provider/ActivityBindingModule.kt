package com.sujin.app2.di.provider

import com.sujin.comments.di.provider.CommentsActivityBindingModule
import dagger.Module

@Module(includes = [CommentsActivityBindingModule::class])
abstract class ActivityBindingModule {

    // Sample
    /*@PerActivity
    @ContributesAndroidInjector(modules = [(MainActivityModule::class), (MainActivityBindingModule::class)])
    abstract fun bindMainActivity(): MainActivity*/
}