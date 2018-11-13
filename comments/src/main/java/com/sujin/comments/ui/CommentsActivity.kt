package com.sujin.comments.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import com.sujin.comments.R
import com.sujin.comments.base.BaseActivity
import com.sujin.comments.databinding.ActivityCommentsBinding
import javax.inject.Inject

class CommentsActivity : BaseActivity<ActivityCommentsBinding>(), CommentsContract.View {

    @Inject
    lateinit var presenter: CommentsContract.Presenter

    override fun layout(): Int = R.layout.activity_comments

    companion object {
        fun getIntent(context: Context) = Intent(context, CommentsActivity::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun buttonClick() {
    }
}
