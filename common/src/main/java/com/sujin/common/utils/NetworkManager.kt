package com.sujin.common.utils

import android.content.Context
import android.net.ConnectivityManager

object NetworkManager {
    fun checkNetworkAvailability(context: Context): Boolean {
        val connectivityManager =
            context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        val networkInfo = connectivityManager.activeNetworkInfo
        return networkInfo != null && networkInfo.isConnected
    }
}