package com.huizhong.pro_common.log

import android.util.Log

class LogUtils {
    companion object{

        @JvmField
        val TAG = "LingGong"

        @JvmStatic
        fun I(tag : String, message : String) {
            Log.i(tag, message)
        }

        @JvmStatic
        fun D(tag: String, message: String) {
            Log.d(tag, message)
        }

        @JvmStatic
        fun W(tag: String, message: String) {
            Log.w(tag, message)
        }

        @JvmStatic
        fun E(tag: String, message: String) {
            Log.e(tag, message)
        }

        @JvmStatic
        fun I(message : String) {
            Log.i(TAG, message)
        }

        @JvmStatic
        fun D(message: String) {
            Log.d(TAG, message)
        }

        @JvmStatic
        fun W(message: String) {
            Log.w(TAG, message)
        }

        @JvmStatic
        fun E(message: String) {
            Log.e(TAG, message)
        }
    }
}