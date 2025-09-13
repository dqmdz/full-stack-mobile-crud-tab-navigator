package com.dqmdz.client

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform