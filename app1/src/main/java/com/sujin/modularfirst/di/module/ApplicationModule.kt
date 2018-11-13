package com.sujin.modularfirst.di.module

import android.app.Application
import android.content.Context
import com.sujin.posts.di.module.PostApplicationModule
import dagger.Module
import dagger.Provides
import com.sujin.posts.di.scope.PerApplication

@Module(
    includes = [
        // ApiModule::class  *Sample. include other modules*
        PostApplicationModule::class
    ]
)
open class ApplicationModule {

   /* @Provides
    fun provideContext(application: Application): Context = application*/

    // Generate this after creating SchedulersFactory, SharedPreferenceManager and DatabaseManager
    /*@Provides
    @PerApplication
    fun provideScheduler() = object : SchedulersFactory {
        override fun ui(): Scheduler = AndroidSchedulers.mainThread()
        override fun io(): Scheduler = Schedulers.io()
    }

    @Provides
    @PerApplication
    fun provideSharedPreference(context: Context): SharedPreferenceManager {
        return SharedPreferenceManager(context)
    }

    @Provides
    @PerApplication
    fun provideDatabaseManager(context: Context): DatabaseManager {
        return DatabaseManager(context)
    }*/
}