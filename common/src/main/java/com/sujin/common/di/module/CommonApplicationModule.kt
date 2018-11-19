package com.sujin.common.di.module

import android.app.Application
import android.content.Context
import com.sujin.common.utils.SchedulersFactory
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
    @PerApplication
    fun provideContext(application: Application): Context = application

    @Provides
    @PerApplication
    fun provideScheduler() = object : SchedulersFactory {
        override fun ui(): Scheduler = AndroidSchedulers.mainThread()
        override fun io(): Scheduler = Schedulers.io()
    }

    @Provides
    @PerApplication
    fun provideDatabaseManager(context: Context): DatabaseManager = DatabaseManager(context)
}

