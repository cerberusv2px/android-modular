package com.sujin.posts.domain

import com.sujin.common.SchedulersFactory
import com.sujin.disk.entity.PostDiskModel
import io.reactivex.Observable
import javax.inject.Inject

class PostRepositoryImpl @Inject constructor(
    private val schedulersFactory: SchedulersFactory,
    private val postLocalRepo: PostRepository.Local
) : PostRepository.Local {

    override fun getAllPost(): Observable<List<PostDiskModel>> {
        return postLocalRepo.getAllPost()
            .subscribeOn(schedulersFactory.io())
            .observeOn(schedulersFactory.ui())
    }

    override fun insert(postList: List<PostDiskModel>) {
        postLocalRepo.insert(postList)
    }
}