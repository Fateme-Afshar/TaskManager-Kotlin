package com.org.taskmanager_kotlin.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.org.taskmanager_kotlin.R
import com.org.taskmanager_kotlin.databinding.ItemViewBinding
import com.org.taskmanager_kotlin.model.Task

class TaskManagerAdapter(private val taskList:MutableList<Task>,private val context: Context) : RecyclerView.Adapter<TaskManagerAdapter.Holder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val itemBinding=DataBindingUtil.
        inflate<ItemViewBinding>(LayoutInflater.from(context), R.layout.item_view,parent,false)

        return Holder(itemBinding)
    }

    override fun getItemCount(): Int {
        return taskList.size
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.bind(taskList[position])
    }

    class Holder(itemView: ItemViewBinding) : RecyclerView.ViewHolder(itemView.root){
        private val itemBinding = itemView

        fun bind(task:Task){

        }
    }
}