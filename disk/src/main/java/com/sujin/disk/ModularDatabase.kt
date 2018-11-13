package com.sujin.disk

import android.arch.persistence.room.Database
import android.arch.persistence.room.Room
import android.arch.persistence.room.RoomDatabase
import android.content.Context
import com.sujin.disk.dao.CommentDao
import com.sujin.disk.dao.PostDao
import com.sujin.disk.entity.CommentDiskModel
import com.sujin.disk.entity.PostDiskModel

@Database(
    entities = [
        (PostDiskModel::class),
        (CommentDiskModel::class)
    ], version = 1
)
abstract class ModularDatabase : RoomDatabase() {

    companion object {

        private var instance: ModularDatabase? = null

        fun getInstance(context: Context): ModularDatabase {
            if (instance == null) {
                instance = createInstance(context)
            }
            return instance as ModularDatabase
        }

        private fun createInstance(context: Context): ModularDatabase {
            return Room.databaseBuilder(context, ModularDatabase::class.java, Constants.DB_NAME)
                .build()
        }
    }

    abstract fun getPostDao(): PostDao
    abstract fun getCommentDao(): CommentDao
}