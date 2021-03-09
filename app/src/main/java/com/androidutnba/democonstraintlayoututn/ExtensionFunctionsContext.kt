package com.androidutnba.democonstraintlayoututn

import android.content.Context
import android.view.animation.AnticipateInterpolator
import android.view.animation.BaseInterpolator
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintSet
import androidx.transition.ChangeBounds
import androidx.transition.TransitionManager

fun Context.showAnimation(
    constrant: ConstraintLayout,
    layoutExpand: Int,
    interpolator: BaseInterpolator?
) {
    val constraintSet = ConstraintSet()
    constraintSet.clone(this, layoutExpand)
    val transition = ChangeBounds()
    interpolator?.let {
        transition.interpolator = it
    }
    transition.duration = 1200
    TransitionManager.beginDelayedTransition(constrant, transition)
    constraintSet.applyTo(constrant)
}