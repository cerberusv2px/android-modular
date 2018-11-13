package com.sujin.posts.ui.posts

import com.sujin.posts.domain.PostRepositoryImpl
import javax.inject.Inject

class PostsPresenter @Inject constructor(
    private val view: PostsContract.View,
    private val postRepositoryImpl: PostRepositoryImpl
) :
    PostsContract.Presenter {

    override fun onButtonClick() {
        // postRepositoryImpl.getAllPost().subscribe()
        view.buttonClick()
    }
}