package com.sujin.disk.dao

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.OnConflictStrategy
import android.arch.persistence.room.Query
import com.sujin.disk.entity.CommentDiskModel

@Dao
interface CommentDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(data: List<CommentDiskModel>)

    @Query("SELECT * FROM comments WHERE post_id=:postId")
    fun getCommentById(postId: Int): List<CommentDiskModel>
}