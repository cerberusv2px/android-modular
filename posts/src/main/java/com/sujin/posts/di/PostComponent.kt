package com.sujin.posts.di

import android.app.Application
import com.sujin.posts.di.module.PostApplicationModule
import com.sujin.posts.di.module.PostModule
import com.sujin.posts.di.provider.PostsActivityBindingModule
import dagger.BindsInstance
import dagger.Subcomponent

@Subcomponent(
    modules = [
        (PostApplicationModule::class),
        (PostModule::class),
        (PostsActivityBindingModule::class)
    ]
)
interface PostComponent {

    @Subcomponent.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): Builder

        fun build(): PostComponent
    }
}