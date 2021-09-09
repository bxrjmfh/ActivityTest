package com.none.activitytest

import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
//为了知晓当前在哪一个Act

open class BaseActivity:AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        Log.d("BaseActivity",javaClass.simpleName)
//       javaclass即获取当前实例的Class对象
    }
}
//修改继承的关系，把三个app都继承自这个BaseApp