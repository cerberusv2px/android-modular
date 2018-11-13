package com.sujin.posts.ui

import javax.inject.Inject

class PostsPresenter @Inject constructor(private val view: PostsContract.View) :
    PostsContract.Presenter {

    override fun onButtonClick() {
        view.buttonClick()
    }
}