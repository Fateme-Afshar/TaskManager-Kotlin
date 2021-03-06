package com.org.taskmanager_kotlin.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "taskTable")
data class Task (@PrimaryKey(autoGenerate = true)@ColumnInfo(name = "id")
                  val taskId:Long=0,
                 @ColumnInfo(name = "title")
                  var title:String="",
                 @ColumnInfo(name = "description")
                  var description:String="",
                 @ColumnInfo(name = "state")
                  var state:TaskState=TaskState.TODO)