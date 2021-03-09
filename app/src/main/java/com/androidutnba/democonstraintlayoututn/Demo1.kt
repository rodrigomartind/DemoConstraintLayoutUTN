package com.androidutnba.democonstraintlayoututn

import android.os.Bundle
import android.view.animation.AnticipateInterpolator
import android.view.animation.AnticipateOvershootInterpolator
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintSet
import androidx.transition.ChangeBounds
import androidx.transition.TransitionManager

class Demo1 : AppCompatActivity() {
    var imageView: ImageView? = null
    var show = false
    var cc1: ConstraintLayout? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.demo1_layout)

        cc1 = findViewById(R.id.constraintInit)
        imageView = findViewById(R.id.imageView)
        imageView?.setOnClickListener { if (show) revertAnimation() else showAnimation() }
    }

    private fun showAnimation() {
        show = true
        val constraintSet = ConstraintSet()
        constraintSet.clone(this, R.layout.demo1_layout_expand)

        val transition = ChangeBounds()
        transition.interpolator = AnticipateOvershootInterpolator()
        transition.duration = 1500

        TransitionManager.beginDelayedTransition(cc1!!, transition)

        constraintSet.applyTo(cc1)
    }

    private fun revertAnimation() {
        show = false
        val constraintSet = ConstraintSet()
        constraintSet.clone(this, R.layout.demo1_layout)

        val transition = ChangeBounds()
        transition.interpolator = AnticipateInterpolator(1.0F)
        transition.duration = 1500

        TransitionManager.beginDelayedTransition(cc1!!, transition)

        constraintSet.applyTo(cc1)
    }

}




