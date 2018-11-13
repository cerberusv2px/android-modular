package com.sujin.common.di.provider

import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBindingModule {

    // Sample
    /*@PerActivity
    @ContributesAndroidInjector(modules = [(MainActivityModule::class), (MainActivityBindingModule::class)])
    abstract fun bindMainActivity(): MainActivity*/
}