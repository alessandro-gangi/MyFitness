package com.example.myfitness.utilis

import android.app.Activity
import android.content.Context
import android.net.ConnectivityManager
import android.util.Log
import java.net.InetAddress


object ConnectionChecker {

    fun isConnectionAvailable(mActivity: Activity): Boolean {
        val connectivityManager = mActivity.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        val activeNetworkInfo = connectivityManager.activeNetworkInfo
        return activeNetworkInfo != null && activeNetworkInfo.isConnected
    }
}