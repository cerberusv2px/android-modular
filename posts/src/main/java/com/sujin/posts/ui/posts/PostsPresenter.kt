package com.sujin.posts.ui.posts

import com.sujin.posts.domain.PostRepositoryImpl
import io.reactivex.disposables.CompositeDisposable
import javax.inject.Inject

class PostsPresenter @Inject constructor(
    private val view: PostsContract.View,
    private val postRepositoryImpl: PostRepositoryImpl
) :
    PostsContract.Presenter {

    private val disposables = CompositeDisposable()

    override fun onButtonClick() {
        // postRepositoryImpl.getAllPost().subscribe()
        view.buttonClick()
    }

    override fun fetchPosts() {
        disposables.add(postRepositoryImpl.fetchPosts()
            .subscribe({
                print(it)
            }, {
                print(it)
            }, {

            })
        )
    }
}