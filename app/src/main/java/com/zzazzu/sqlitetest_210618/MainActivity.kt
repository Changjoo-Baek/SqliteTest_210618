package com.zzazzu.sqlitetest_210618

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Context
import android.content.Intent
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.zzazzu.sqlitetest_210618.Changer.Companion.saveData
import com.zzazzu.sqlitetest_210618.common.BackPressHandler


class MainActivity : AppCompatActivity() {
    private val TAG = this.javaClass.simpleName
    lateinit var mContext: Context
    lateinit var ClassName: String
    lateinit var btn2Target: Button
    lateinit var backPressHandler : BackPressHandler


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.e(TAG, "onCreate()")
        mContext = this@MainActivity
        backPressHandler = BackPressHandler(this)
        ClassName = this.localClassName

        val profile = Profiles("홍길동", 3S, "남성")

        val textView = findViewById<TextView>(R.maintextView)
        textView.text = "코틀린 메인화면"

        btn2Target = findViewById(R.id.mainbutton)
        btn2Target.setOnClickListener({ View: View? ->
            val intent = Intent(this@MainActivity, TargetActivity::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            intent.putExtra("parcel", profile)
            intent.putExtra("classname", ClassName)
            startActivity(intent)
        })
        }


    }
}