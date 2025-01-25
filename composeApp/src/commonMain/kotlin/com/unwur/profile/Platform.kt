package com.unwur.profile

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform