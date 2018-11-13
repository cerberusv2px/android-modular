package com.sujin.disk

import android.content.Context
import com.sujin.disk.dao.CommentDao
import com.sujin.disk.dao.PostDao
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class DatabaseManager @Inject constructor(var context: Context) {

    private val instance = ModularDatabase.getInstance(context)

    fun beginTransaction() = instance.beginTransaction()
    fun endTransaction() = instance.endTransaction()

    fun getPostDao(): PostDao = instance.getPostDao()
    fun getCommetDao(): CommentDao = instance.getCommentDao()

    fun dropDatabase() = instance.clearAllTables()
}