package com.sujin.posts.data.remote

import com.google.gson.annotations.SerializedName

data class Post(
    @SerializedName("userId") val userId: Int,
    @SerializedName("id") val postId: Int,
    @SerializedName("title") val postTitle: String,
    @SerializedName("body") val postBody: String
)