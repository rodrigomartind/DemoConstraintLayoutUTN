package com.androidutnba.democonstraintlayoututn

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.BounceInterpolator
import android.view.animation.OvershootInterpolator
import android.widget.Button
import androidx.constraintlayout.widget.ConstraintLayout

class Demo_3 : AppCompatActivity() {
    var button: Button? = null
    var show = false
    var constraintLayout: ConstraintLayout? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.demo3_layout)
        constraintLayout = findViewById(R.id.constraintInit)
        button = findViewById(R.id.button2)
        button?.setOnClickListener {
            show = if (show) {
                revertAnimation(
                    constraintLayout!!,
                    R.layout.demo3_layout,
                    OvershootInterpolator()
                )
                false
            } else {
                showAnimation(constraintLayout!!, R.layout.demo3_layout_expand, OvershootInterpolator())
                true
            }
        }

    }
}