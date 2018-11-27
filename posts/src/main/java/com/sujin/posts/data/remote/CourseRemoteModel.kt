package com.sujin.posts.data.remote

import com.google.gson.annotations.SerializedName

data class CourseRemoteModel(
    @SerializedName("courses") var courses: List<Course>
)