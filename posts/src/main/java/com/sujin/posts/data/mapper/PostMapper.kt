package com.sujin.posts.data.mapper

import com.sujin.disk.entity.PostDiskModel
import com.sujin.posts.data.remote.Post

object PostMapper: Mapper<PostDiskModel, Post> {

    override fun mapFromLocal(type: PostDiskModel): Post {
        return Post(type.userId, type.id, type.title, type.body)
    }

    override fun mapToLocal(type: Post): PostDiskModel {
        return PostDiskModel(type.postId, type.postTitle, type.postBody, type.userId)
    }
}