package com.sujin.app2

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.sujin.comments.ui.CommentsActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        startActivity(CommentsActivity.getIntent(this))
    }
}
