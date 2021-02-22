package com.org.taskmanager_kotlin.repository

import android.content.Context
import androidx.lifecycle.LiveData
import com.org.taskmanager_kotlin.database.TaskDao
import com.org.taskmanager_kotlin.database.TaskDatabase
import com.org.taskmanager_kotlin.model.Task

object TaskRepository :IRepository<Task>{
    lateinit var context:Context

    var dao:TaskDao
    var database: TaskDatabase = TaskDatabase.getInstance(context.applicationContext)

    init {
        dao= database.getTaskDao()
    }

    override fun get(id: Long): LiveData<Task> {
        return dao.get(id)
    }

    override fun getList():LiveData<List<Task>> {
        return dao.getList()
    }

    override fun insert(task: Task) {
        database.executor.execute { dao.insert(task) }
    }

    override fun delete(task: Task) {
        database.executor.execute{ dao.delete(task)}
    }

    override fun update(task: Task) {
        database.executor.execute{ dao.update(task)}
    }

    override fun deleteAll() {
        database.executor.execute{ dao.deleteAll()}
    }

}