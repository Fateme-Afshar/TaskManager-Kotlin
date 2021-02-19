package com.org.taskmanager_kotlin.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "taskTable")
data class Task (@PrimaryKey(autoGenerate = true)@ColumnInfo(name = "id")
                 private val taskId:Long=0,
                 @ColumnInfo(name = "title")
                 private var title:String="",
                 @ColumnInfo(name = "description")
                 private var description:String="",
                 @ColumnInfo(name = "state")
                 private var state:TaskState=TaskState.TODO)