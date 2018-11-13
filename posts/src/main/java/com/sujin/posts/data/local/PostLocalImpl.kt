package com.sujin.posts.data.local

import com.sujin.disk.DatabaseManager
import com.sujin.disk.entity.PostDiskModel
import com.sujin.posts.domain.PostRepository
import io.reactivex.Observable
import javax.inject.Inject

class PostLocalImpl @Inject constructor(
    databaseManager: DatabaseManager
) : PostRepository.Local {

    private val postDao = databaseManager.getPostDao()

    override fun getAllPost(): Observable<List<PostDiskModel>> {
        return Observable.fromCallable {
            postDao.getPosts()
        }
    }

    override fun insert(postList: List<PostDiskModel>) {
        postDao.insert(postList)
    }
}