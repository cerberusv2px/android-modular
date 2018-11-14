package com.sujin.common.di.module

import android.app.Application
import android.content.Context
import com.sujin.common.SchedulersFactory
import com.sujin.common.di.scope.PerApplication
import com.sujin.disk.DatabaseManager
import dagger.Module
import dagger.Provides
import io.reactivex.Scheduler
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

@Module(includes = [(ApiModule::class)])
class CommonApplicationModule {

    @Provides
    fun provideContext(application: Application): Context = application

    @Provides
    fun provideScheduler() = object : SchedulersFactory {
        override fun ui(): Scheduler = AndroidSchedulers.mainThread()
        override fun io(): Scheduler = Schedulers.io()
    }

    @Provides
    fun provideDatabaseManager(context: Context): DatabaseManager = DatabaseManager(context)
}

