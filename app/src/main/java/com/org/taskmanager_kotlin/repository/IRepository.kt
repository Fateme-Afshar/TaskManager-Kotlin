package com.org.taskmanager_kotlin.repository

import androidx.lifecycle.LiveData

interface IRepository<T> {
    fun get(id:Long) : LiveData<T>
    fun getList():LiveData<List<T>>
    fun insert(task: T)
    fun delete(task: T)
    fun update(task: T)
    fun deleteAll()
}