package com.sujin.posts.domain

import com.sujin.common.utils.SchedulersFactory
import com.sujin.disk.entity.PostDiskModel
import com.sujin.posts.data.mapper.PostMapper
import com.sujin.posts.data.remote.Post
import io.reactivex.Observable
import javax.inject.Inject

class PostRepositoryImpl @Inject constructor(
    private val schedulersFactory: SchedulersFactory,
    private val postLocalRepo: PostRepository.Local,
    private val postRemoteRepo: PostRepository.Remote
) : PostRepository.Local, PostRepository.Remote {

    override fun getAllPost(): Observable<List<PostDiskModel>> {
        return postLocalRepo.getAllPost()
            .subscribeOn(schedulersFactory.io())
            .observeOn(schedulersFactory.ui())
    }

    override fun insert(postList: List<PostDiskModel>) {
        postLocalRepo.insert(postList)
    }

    override fun fetchPosts(): Observable<List<Post>> {
        return postRemoteRepo.fetchPosts()
            .doOnNext { posts ->
                insert(posts.map { PostMapper.mapToLocal(it) })
            }
            .subscribeOn(schedulersFactory.io())
            .observeOn(schedulersFactory.ui())
    }
}