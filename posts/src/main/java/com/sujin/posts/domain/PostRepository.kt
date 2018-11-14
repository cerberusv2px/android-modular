package com.sujin.posts.domain

import com.sujin.disk.entity.PostDiskModel
import com.sujin.posts.data.remote.Post
import io.reactivex.Observable

interface PostRepository {

    interface Local {
        fun getAllPost(): Observable<List<PostDiskModel>>
        fun insert(postList: List<PostDiskModel>)
    }

    interface Remote {
        fun fetchPosts(): Observable<List<Post>>
    }
}