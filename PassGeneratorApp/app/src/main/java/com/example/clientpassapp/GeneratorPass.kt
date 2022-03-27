package com.example.clientpassapp

import java.lang.StringBuilder
import java.util.*

class GeneratorPass {
    private val characters = "abcdefghijkmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()=<>?{}"

    fun PassGenerator(sizeOfPasswordString: Int): String? {
        val rnd = Random()
        val sb = StringBuilder(sizeOfPasswordString)

        for (i in 0 until sizeOfPasswordString) {
            sb.append(characters[rnd.nextInt(characters.length)])
        }

        return sb.toString()
    }
}

