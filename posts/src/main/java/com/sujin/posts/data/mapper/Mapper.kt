package com.sujin.posts.data.mapper

interface Mapper<E, D> {
    fun mapFromLocal(type: E): D
    fun mapToLocal(type: D): E
}