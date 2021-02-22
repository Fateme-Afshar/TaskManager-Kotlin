package com.org.taskmanager_kotlin.view.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.org.taskmanager_kotlin.R
import com.org.taskmanager_kotlin.databinding.ItemViewBinding
import com.org.taskmanager_kotlin.viewModel.MainViewModel

class MainFragment : Fragment() {
    private lateinit var binding: ItemViewBinding
    private lateinit var viewModel:MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel=ViewModelProvider(this).get(MainViewModel::class.java)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
       binding=DataBindingUtil.inflate(inflater,R.layout.fragment_mainf,container,false)

        return binding.root
    }

    companion object {
        @JvmStatic
        fun newInstance() =
                MainFragment().apply {
                    arguments = Bundle().apply {
                    }
                }
    }
}