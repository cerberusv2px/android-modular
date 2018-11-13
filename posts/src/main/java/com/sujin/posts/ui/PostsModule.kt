package com.sujin.posts.ui

import dagger.Module
import dagger.Provides

@Module
class PostsModule {

    @Provides
    fun providePostsView(activity: PostsActivity): PostsContract.View {
        return activity
    }

    @Provides
    fun providePostsPresenter(view: PostsContract.View): PostsContract.Presenter {
        return PostsPresenter(view)
    }
}