package com.github.yagiryu.kmm_compose

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform