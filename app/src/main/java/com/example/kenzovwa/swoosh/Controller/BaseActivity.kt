package com.example.kenzovwa.swoosh.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

open class BaseActivity : AppCompatActivity() {

    val TAG = "Lifecycle"

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d(TAG, "${javaClass.simpleName} On Create")
        super.onCreate(savedInstanceState)
    }

    fun onStart(savedInstanceState: Bundle?) {
        Log.d(TAG, "${javaClass.simpleName} On Start")
        super.onCreate(savedInstanceState)
    }

     fun onResume(savedInstanceState: Bundle?) {
        Log.d(TAG, "${javaClass.simpleName} On Resume")
        super.onCreate(savedInstanceState)
    }

     fun onStop(savedInstanceState: Bundle?) {
        Log.d(TAG, "${javaClass.simpleName} On Stop")
        super.onCreate(savedInstanceState)
    }

     fun onPause(savedInstanceState: Bundle?) {
        Log.d(TAG, "${javaClass.simpleName} On Pause")
        super.onCreate(savedInstanceState)
    }

     fun onDestroy(savedInstanceState: Bundle?) {
        Log.d(TAG, "${javaClass.simpleName} On Destroy")
        super.onCreate(savedInstanceState)
    }

     fun onRestart(savedInstanceState: Bundle?) {
        Log.d(TAG, "${javaClass.simpleName} On Restart")
        super.onCreate(savedInstanceState)
    }

}
