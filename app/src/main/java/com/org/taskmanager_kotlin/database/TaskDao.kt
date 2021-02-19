package com.org.taskmanager_kotlin.database

import com.org.taskmanager_kotlin.model.Task

interface TaskDao {

    fun get(id:Long) : Task
    fun getList():List<Task>
    fun insert(task:Task)
    fun delete(task:Task)
    fun update(task:Task)
    fun deleteAll()
}