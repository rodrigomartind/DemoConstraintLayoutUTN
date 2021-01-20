package com.androidutnba.democonstraintlayoututn

import android.content.Context
import android.view.animation.AnticipateInterpolator
import android.view.animation.BaseInterpolator
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintSet
import androidx.transition.ChangeBounds
import androidx.transition.TransitionManager

fun Context.showAnimation(
    constrant: ConstraintLayout, layoutExpand: Int,
    interpolator: BaseInterpolator
) {
    val constraintSet = ConstraintSet()
    constraintSet.clone(this, layoutExpand)
    val transition = ChangeBounds()
    transition.interpolator = interpolator
    transition.duration = 1200
    TransitionManager.beginDelayedTransition(constrant, transition)
    constraintSet.applyTo(constrant)
}


fun Context.revertAnimation(
    constrant: ConstraintLayout,
    layoutNormal: Int,
    interpolator: BaseInterpolator
) {
    val constraintSet = ConstraintSet()
    constraintSet.clone(this, layoutNormal)
    val transition = ChangeBounds()
    transition.interpolator = interpolator
    transition.duration = 1200
    TransitionManager.beginDelayedTransition(constrant, transition)
    constraintSet.applyTo(constrant)
}