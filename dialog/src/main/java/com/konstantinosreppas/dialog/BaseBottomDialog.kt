package com.konstantinosreppas.dialog

import android.app.Activity
import android.app.Dialog
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.Gravity
import android.view.Window
import androidx.appcompat.content.res.AppCompatResources
import androidx.core.graphics.drawable.DrawableCompat
import kotlinx.android.synthetic.main.base_dialog_bg_layout.*


abstract class BaseBottomDialog(
    private val c: Activity,
    private val backgroundTintColorId: Int = android.R.color.white,
    styleId: Int = R.style.CustomDialog
) : Dialog(c, styleId) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        requestWindowFeature(Window.FEATURE_NO_TITLE)

        window?.setGravity(Gravity.BOTTOM)
        window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))

    }

    override fun setContentView(resId: Int) {
        super.setContentView(R.layout.base_dialog_bg_layout)

        val unwrappedDrawable =
            AppCompatResources.getDrawable(context, R.drawable.white_rounded_background)

        if (unwrappedDrawable != null) {

            val wrappedDrawable =
                DrawableCompat.wrap(unwrappedDrawable)
            DrawableCompat.setTint(wrappedDrawable, c.resources.getColor(backgroundTintColorId))
            base_root_dialog.background = wrappedDrawable
        }

        val view = layoutInflater.inflate(resId, base_root_dialog, false)
        base_root_dialog.addView(view)

    }

}