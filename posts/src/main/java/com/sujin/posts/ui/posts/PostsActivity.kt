package com.sujin.posts.ui.posts

import android.content.Context
import android.content.Intent
import android.os.Bundle
import com.sujin.comments.ui.CommentsActivity
import com.sujin.comments.base.BaseActivity
import com.sujin.posts.R
import com.sujin.posts.databinding.ActivityPostsBinding
import javax.inject.Inject

class PostsActivity : BaseActivity<ActivityPostsBinding>(),
    PostsContract.View {

    @Inject
    lateinit var postPresenter: PostsContract.Presenter

    override fun layout(): Int = R.layout.activity_posts

    companion object {
        fun getIntent(context: Context) = Intent(context, PostsActivity::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding.btnClick.setOnClickListener {
            postPresenter.onButtonClick()
        }
    }

    override fun buttonClick() {
        startActivity(Intent(this@PostsActivity, CommentsActivity::class.java))
    }
}
