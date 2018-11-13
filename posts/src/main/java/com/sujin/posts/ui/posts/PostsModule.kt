package com.sujin.posts.ui.posts

import com.sujin.posts.di.scope.PerActivity
import dagger.Module
import dagger.Provides

@Module
class PostsModule {

    @Provides
    @PerActivity
    fun providePostsView(activity: PostsActivity): PostsContract.View {
        return activity
    }

    @Provides
    @PerActivity
    fun providePostsPresenter(view: PostsContract.View): PostsContract.Presenter {
        return PostsPresenter(view)
    }
}