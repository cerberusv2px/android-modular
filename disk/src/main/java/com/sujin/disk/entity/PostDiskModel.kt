package com.sujin.disk.entity

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey
import com.sujin.disk.Constants

@Entity(tableName = Constants.TBL_POST)
data class PostDiskModel(
    @PrimaryKey @ColumnInfo(name = Constants.POST_ID) var id: Int,
    @ColumnInfo(name = Constants.POST_TITLE) var title: String,
    @ColumnInfo(name = Constants.POST_BODY) var body: String,
    @ColumnInfo(name = Constants.POST_USER_ID) var userId: Int
)