package com.org.taskmanager_kotlin.database

import androidx.lifecycle.LiveData
import com.org.taskmanager_kotlin.model.Task

interface TaskDao {

    fun get(id:Long) : LiveData<Task>
    fun getList():LiveData<List<Task>>
    fun insert(task:Task)
    fun delete(task:Task)
    fun update(task:Task)
    fun deleteAll()
}