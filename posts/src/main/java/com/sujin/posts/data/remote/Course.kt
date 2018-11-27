package com.sujin.posts.data.remote

import com.google.gson.annotations.SerializedName

data class Course(
    @SerializedName("id") var id: Int,
    @SerializedName("title") var title: String
)