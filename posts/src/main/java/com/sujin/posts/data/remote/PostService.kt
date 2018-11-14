package com.sujin.posts.data.remote

import io.reactivex.Observable
import retrofit2.http.GET

interface PostService {

    @GET("/posts/")
    fun getPosts(): Observable<List<Post>>
}