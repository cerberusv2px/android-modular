package com.sujin.posts.ui.posts

import com.sujin.posts.domain.PostRepositoryImpl
import dagger.Module
import dagger.Provides

@Module
class PostsActivityModule {

    @Provides
    //@PerActivity
    fun providePostsView(activity: PostsActivity): PostsContract.View {
        return activity
    }

    @Provides
    //@PerActivity
    fun providePostsPresenter(
        view: PostsContract.View,
        postRepositoryImpl: PostRepositoryImpl
    ): PostsContract.Presenter {
        return PostsPresenter(view, postRepositoryImpl)
    }
}