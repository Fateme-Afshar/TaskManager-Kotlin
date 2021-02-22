package com.org.taskmanager_kotlin.view.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.org.taskmanager_kotlin.R
import com.org.taskmanager_kotlin.databinding.FragmentAddBinding

/**
 * A simple [Fragment] subclass.
 * Use the [AddFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class AddTaskFragment : BottomSheetDialogFragment() {
    private lateinit var fragmentAddBinding: FragmentAddBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_add, container, false)
    }

    companion object {
        @JvmStatic
        fun newInstance() =
            AddTaskFragment().apply {
                arguments = Bundle().apply {
                }
            }
    }
}