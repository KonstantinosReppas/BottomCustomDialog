package com.KonstantinosReppas.bottomcustomdialog

import android.app.Activity
import android.os.Bundle
import com.konstantinosreppas.dialog.BaseBottomDialog
import kotlinx.android.synthetic.main.dialog_layout.*

class MyCustomBottomDialog(
    c: Activity,
    backgroundTintColorId: Int
) : BaseBottomDialog(c, backgroundTintColorId) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.dialog_layout)

        infodialog_ok_button.setOnClickListener { dismiss() }
    }




}