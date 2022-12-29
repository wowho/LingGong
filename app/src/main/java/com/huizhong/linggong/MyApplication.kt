package com.huizhong.linggong

import android.app.Application
import com.huizhong.pro_common.log.LogUtils

class MyApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        LogUtils.I("MyApplication", "onCreate")
    }

    override fun onLowMemory() {
        super.onLowMemory()
    }

    override fun onTerminate() {
        super.onTerminate()
    }

}