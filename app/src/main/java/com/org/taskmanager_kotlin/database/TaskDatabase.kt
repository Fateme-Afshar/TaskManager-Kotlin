package com.org.taskmanager_kotlin.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.org.taskmanager_kotlin.model.Task
import java.util.concurrent.Executors

@Database(entities = [Task::class],version = 1)
abstract class TaskDatabase :RoomDatabase(){
    val executor=Executors.newFixedThreadPool(5)

    abstract fun  getTaskDao(): TaskDao

    companion object{
        fun getInstance(context: Context): TaskDatabase {
            return Room.
            databaseBuilder(
                    context.applicationContext,
                    TaskDatabase::class.java,
                    "taskDatabase").
            build()
        }
    }
}