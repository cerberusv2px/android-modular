package com.sujin.app2.di.module

import android.app.Application
import android.content.Context
import com.sujin.app2.di.scope.PerApplication
import dagger.Module
import dagger.Provides

@Module(
    includes = [
        // ApiModule::class  *Sample. include other modules*
    ]
)
open class ApplicationModule {

    @Provides
    @PerApplication
    fun provideContext(application: Application): Context = application

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