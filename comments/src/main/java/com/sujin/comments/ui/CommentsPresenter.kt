package com.sujin.comments.ui

import javax.inject.Inject

class CommentsPresenter @Inject constructor(val view: CommentsContract.View) :
    CommentsContract.Presenter {

    override fun onButtonClick() {
    }
}