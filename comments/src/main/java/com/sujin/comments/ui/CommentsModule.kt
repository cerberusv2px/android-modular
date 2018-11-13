package com.sujin.comments.ui

import com.sujin.comments.di.scope.PerActivity
import dagger.Module
import dagger.Provides

@Module
class CommentsModule {

    @Provides
    @PerActivity
    fun provideCommentView(activity: CommentsActivity): CommentsContract.View {
        return activity
    }

    @Provides
    @PerActivity
    fun provideCommentPresenter(view: CommentsContract.View): CommentsContract.Presenter {
        return CommentsPresenter(view)
    }
}