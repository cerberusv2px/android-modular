package com.sujin.posts.ui

interface PostsContract {

    interface View {
        fun buttonClick()
    }

    interface Presenter {
        fun onButtonClick()
    }
}