package com.Angus

import java.io.File

fun main() {
//    writeTest()
    File("data.txt").bufferedReader().lines().forEach {
        println(it)
    }

}

private fun writeTest() {
    //    File("output.txt").writeText("abc123")
    //printWriter
    File("output.txt").printWriter().use {
        it.println("1st line")
        it.println("2nd line")
        it.println("3rd line")
    }
    //bufferedWriter
    File("output.txt").bufferedWriter().use {
        it.write("1st line\n")
        it.write("2nd line\n")
        it.write("3rd line\n")
    }
}