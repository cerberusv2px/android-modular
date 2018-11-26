package com.sujin.modularfirst

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.sujin.posts.ui.posts.PostsActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        startActivity(PostsActivity.getIntent(this))



    }
}
