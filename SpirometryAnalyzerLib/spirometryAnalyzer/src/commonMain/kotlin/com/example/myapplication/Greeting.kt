package com.example.myapplication

class Greeting {
    fun greeting(): String {
        return "Ni Hao, ${Platform().platform}!"
    }
}