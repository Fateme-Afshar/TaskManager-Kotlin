package com.org.taskmanager_kotlin.view

import androidx.fragment.app.Fragment

class MainActivity : SingleFragmentActivity() {
    override fun getFragment(): Fragment {
        return MainFragment.newInstance()
    }
}