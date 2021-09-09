package com.none.activitytest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import com.none.activitytest.databinding.ActivityMainBinding

class MainActivity : BaseActivity()
{
    private val tag="MainActivity"

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        Log.d(tag,"onCreat")
        setContentView(R.layout.activity_main)

//       调用Bundle中的参数
        if(savedInstanceState!=null)
        {
            val tempdata=savedInstanceState.getString("data_key")
            Log.d("tag",tempdata.toString())
        }

        val binding_1 = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding_1.root)
        binding_1.button1.setOnClickListener(){
            val intent=Intent(this,NormalActivity::class.java)
            startActivity(intent)
        }

        binding_1.button2.setOnClickListener(){
            val intent=Intent(this,DailogActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onStart()
    {
//        在不可见到可见的时候调用
        super.onStart()
        Log.d(tag,"onStart")
    }

    override fun onResume()
    {
//        在act处于栈顶的时候，且处于运行状态调用
        super.onResume()
        Log.d(tag,"onResume")
    }

    override fun onPause()
    {
//        启动和回复栈顶的act使用
        super.onPause()
        Log.d(tag,"pause")
    }

    override fun onStop()
    {
//        完全不可见时调用--create
        super.onStop()
        Log.d(tag,"stop.")
    }

    override fun onDestroy()
    {
//        销毁时调用
        super.onDestroy()
        Log.d(tag,"onDestroy")
    }

    override fun onRestart()
    {
//        停止到重新运行时调用
        super.onRestart()
        Log.d(tag,"onRestart")
    }

    override fun onSaveInstanceState(outState: Bundle)
    {
        super.onSaveInstanceState(outState)
        val tempData="sth you just typed"
        outState.putString("data_key",tempData)
//        使用putString保存临时数据，1. 键值用于从Bundle里取值  2.数据
//        但是没有卵用
    }

}