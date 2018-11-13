package com.sujin.disk.dao

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.OnConflictStrategy
import android.arch.persistence.room.Query
import com.sujin.disk.entity.PostDiskModel

@Dao
interface PostDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(data: List<PostDiskModel>)

    @Query("SELECT * FROM post")
    fun getPosts(): List<PostDiskModel>
}