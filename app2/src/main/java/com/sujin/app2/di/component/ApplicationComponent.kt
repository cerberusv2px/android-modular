package com.sujin.app2.di.component

import android.app.Application
import com.sujin.app2.TwoApplication
import com.sujin.app2.di.module.ApplicationModule
import com.sujin.app2.di.provider.ActivityBindingModule
import com.sujin.common.di.scope.PerApplication

import dagger.BindsInstance
import dagger.Component
import dagger.android.support.AndroidSupportInjectionModule

@PerApplication
@Component(
    modules = [
        (ActivityBindingModule::class),
        (ApplicationModule::class),
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

    fun inject(app: TwoApplication)
}