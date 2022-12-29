package com.huizhong.linggong

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.huizhong.pro_common.log.LogUtils
import com.huizhong.pro_net.NetClient
import com.huizhong.pro_net.callback.ResponseCallback
import com.huizhong.pro_net.RetrofitManager

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        LogUtils.E("gyz", "Hello!!!")

        var handler = Handler()

        NetClient.setBaseUrl("https://api.github.com/")

        var call = RetrofitManager.getRetrofit().create(TestApi::class.java).listRepos("octocat")
        NetClient.executeAsync(call, object :
            ResponseCallback<List<Repo>> {
            override fun onSuccess(t: List<Repo>?) {
                LogUtils.E("MainActivity", t?.get(0)!!.name)
            }

            override fun onFailure(t: Throwable?) {
                LogUtils.E("MainActivity", t?.message!!)
            }

        })
    }
}