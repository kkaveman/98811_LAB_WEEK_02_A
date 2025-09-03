package com.example.a98811_lab_week_02_a

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.util.Log

class MainActivity : AppCompatActivity() {

    companion object{
        private const val TAG = "MainActivity"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContentView(R.layout.activity_main)
        Log.d(TAG,"onCreate")
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    override fun onRestart(){
        super.onRestart()
        Log.d(TAG,"OnRestart")
    }

    override fun onStart(){
        super.onStart()
        Log.d(TAG,"OnStart")
    }

    override fun onResume(){
        super.onResume()
        Log.d(TAG,"OnResume")
    }

    override fun onPause(){
        super.onPause()
        Log.d(TAG,"onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG,"OnStop")
    }
    override fun onDestroy(){
        super.onDestroy()
        Log.d(TAG,"OnDestroy")
    }


}