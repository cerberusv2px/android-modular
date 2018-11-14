package com.sujin.posts.data.remote

import com.sujin.posts.domain.PostRepository
import io.reactivex.Observable
import javax.inject.Inject

class PostRemoteImpl @Inject constructor(private val postService: PostService): PostRepository.Remote {

    override fun fetchPosts(): Observable<List<Post>> {
        return postService.getPosts()
    }
}