package com.KonstantinosReppas.bottomcustomdialog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mDialog = MyCustomBottomDialog(this, android.R.color.white)
        mDialog.show()
    }
}
