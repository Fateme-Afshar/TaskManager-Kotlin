package com.org.taskmanager_kotlin.repository

interface IRepository<T> {
    fun get(id:Long) : T
    fun getList():List<T>
    fun insert(task: T)
    fun delete(task: T)
    fun update(task: T)
    fun deleteAll()
}