package com.androidutnba.democonstraintlayoututn

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnticipateInterpolator
import android.view.animation.CycleInterpolator
import androidx.constraintlayout.helper.widget.Flow
import androidx.constraintlayout.widget.ConstraintLayout

class Demo4 : AppCompatActivity() {
    var flow: Flow? = null
    var show = false
    var constraintLayout: ConstraintLayout? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.demo4_layout)
        constraintLayout = findViewById(R.id.constraintInit)
        flow = findViewById(R.id.flow)
        flow?.setOnClickListener {
            show = if (show) {
                showAnimation(
                    constraintLayout!!,
                    R.layout.demo4_layout,
                    AnticipateInterpolator()
                )
                false
            } else {
                showAnimation(constraintLayout!!, R.layout.demo4_layout_expand, AnticipateInterpolator())
                true
            }
        }
    }
}