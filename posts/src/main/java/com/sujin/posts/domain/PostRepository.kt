package com.sujin.posts.domain

import com.apollographql.apollo.api.Response
import com.sujin.disk.entity.PostDiskModel
import com.sujin.posts.CourseBuilderQuery
import com.sujin.posts.data.remote.CourseRemoteModel
import com.sujin.posts.data.remote.Post
import io.reactivex.Observable

interface PostRepository {

    interface Local {
        fun getAllPost(): Observable<List<PostDiskModel>>
        fun insert(postList: List<PostDiskModel>)
    }

    interface Remote {
        fun fetchPosts(): Observable<List<Post>>
        fun getApolloData(): Observable<CourseRemoteModel>

    }
}