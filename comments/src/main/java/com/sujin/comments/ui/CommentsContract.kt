package com.sujin.comments.ui

interface CommentsContract {

    interface View {
        fun buttonClick()
    }

    interface Presenter {
        fun onButtonClick()
    }
}