package com.sujin.posts.data.remote

import com.apollographql.apollo.ApolloClient
import com.apollographql.apollo.rx2.Rx2Apollo
import com.google.gson.Gson
import com.sujin.posts.CourseBuilderQuery
import com.sujin.posts.domain.PostRepository
import io.reactivex.Observable
import javax.inject.Inject

class PostRemoteImpl @Inject constructor(
    private val postService: PostService,
    private val apolloClient: ApolloClient,
    private val gson: Gson
) : PostRepository.Remote {

    override fun fetchPosts(): Observable<List<Post>> {
        return postService.getPosts()
    }

    override fun getApolloData(): Observable<CourseRemoteModel> {
        val query = CourseBuilderQuery.builder().build()
        return Rx2Apollo.from(apolloClient.query(query))
            .flatMap {
                val temp = gson.toJson(it.data())
                println("Courses $temp")
                return@flatMap Observable.just(temp)
            }
            .flatMap {
                val temp2 = gson.fromJson<CourseRemoteModel>(it, CourseRemoteModel::class.java)
                println("Course remote $temp2")
                return@flatMap Observable.just(temp2)
            }

    }
}