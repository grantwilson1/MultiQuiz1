package edu.vt.mobiledev.multiquiz

import androidx.annotation.StringRes

data class Answer(
    @StringRes val textResId: Int,
    val isCorrect: Boolean,
    var isEnabled: Boolean = true,
    var isSelected: Boolean = false
)