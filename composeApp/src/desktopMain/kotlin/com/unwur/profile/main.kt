package com.unwur.profile

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "Anwar Profile Page",
    ) {
        App()
    }
}