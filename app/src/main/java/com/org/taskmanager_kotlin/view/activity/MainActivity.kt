package com.org.taskmanager_kotlin.view.activity

import androidx.fragment.app.Fragment
import com.org.taskmanager_kotlin.view.fragment.MainFragment

class MainActivity : SingleFragmentActivity() {
    override fun getFragment(): Fragment {
        return MainFragment.newInstance()
    }
}