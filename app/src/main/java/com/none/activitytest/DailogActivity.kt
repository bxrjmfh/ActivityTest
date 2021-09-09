package com.none.activitytest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class DailogActivity : BaseActivity()
//修改继承即修改class名之后的类名？？？
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dailog)
    }
}