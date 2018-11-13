package com.sujin.disk.entity

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.ForeignKey
import android.arch.persistence.room.PrimaryKey
import com.sujin.disk.Constants

@Entity(
    tableName = Constants.TBL_COMMENTS,
    foreignKeys = [
        (ForeignKey(
            entity = PostDiskModel::class,
            parentColumns = [Constants.POST_ID],
            childColumns = [Constants.COMMENT_POST_ID],
            onUpdate = ForeignKey.CASCADE,
            onDelete = ForeignKey.CASCADE
        ))
    ]
)
class CommentDiskModel(
    @PrimaryKey @ColumnInfo(name = Constants.COMMENT_ID) var id: Int,
    @ColumnInfo(name = Constants.COMMENT_NAME) var name: String,
    @ColumnInfo(name = Constants.COMMENT_EMAIL) var email: String,
    @ColumnInfo(name = Constants.COMMENT_BODY) var body: String,
    @ColumnInfo(name = Constants.COMMENT_POST_ID) var postId: Int
)