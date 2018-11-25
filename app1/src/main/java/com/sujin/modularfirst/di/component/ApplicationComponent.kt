package com.sujin.modularfirst.di.component

import android.app.Application
import com.sujin.common.di.module.CommonApplicationModule
import com.sujin.common.di.scope.PerApplication
import com.sujin.modularfirst.OneApplication
import com.sujin.modularfirst.di.module.ApplicationModule
import com.sujin.modularfirst.di.provider.ActivityBindingModule
import com.sujin.posts.di.module.PostApplicationModule


import dagger.BindsInstance
import dagger.Component
import dagger.android.support.AndroidSupportInjectionModule

@PerApplication
@Component(
    modules = [
        (ActivityBindingModule::class),
        (ApplicationModule::class),
        (PostApplicationModule::class),
        (CommonApplicationModule::class),
        (AndroidSupportInjectionModule::class)
    ]
)
interface ApplicationComponent {

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): Builder

        fun build(): ApplicationComponent
    }

    fun inject(app: OneApplication)
}