package com.androidutnba.democonstraintlayoututn

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AccelerateDecelerateInterpolator
import android.view.animation.AccelerateInterpolator
import android.view.animation.AnticipateInterpolator
import android.view.animation.BounceInterpolator
import android.widget.Button
import androidx.constraintlayout.widget.ConstraintLayout

class Demo2 : AppCompatActivity() {
    var button: Button? = null
    var show = false
    var constraintLayout: ConstraintLayout? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.demo2_layout)
        constraintLayout = findViewById(R.id.constraintInit)
        button = findViewById(R.id.button)
        button?.setOnClickListener {
            show = if (show) {
                revertAnimation(
                    constraintLayout!!,
                    R.layout.demo2_layout,
                    BounceInterpolator()
                )
                false
            } else {
                showAnimation(constraintLayout!!, R.layout.demo2_layout_expand, BounceInterpolator())
                true
            }
        }
    }
}