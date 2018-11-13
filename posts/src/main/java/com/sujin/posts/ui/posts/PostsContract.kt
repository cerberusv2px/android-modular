package com.sujin.posts.ui.posts

interface PostsContract {

    interface View {
        fun buttonClick()
    }

    interface Presenter {
        fun onButtonClick()
    }
}