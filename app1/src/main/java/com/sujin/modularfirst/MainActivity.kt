package com.sujin.modularfirst

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.google.android.play.core.splitinstall.SplitInstallManagerFactory
import com.google.android.play.core.splitinstall.SplitInstallRequest
import com.sujin.posts.ui.posts.PostsActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        startActivity(PostsActivity.getIntent(this))

        val splitInstallManager = SplitInstallManagerFactory.create(this)
        val request = SplitInstallRequest.newBuilder()
            .addModule("dynamic_feature")
            .build()

        splitInstallManager.startInstall(request)
            .addOnSuccessListener { sessionId -> }
            .addOnFailureListener {}
    }
}
