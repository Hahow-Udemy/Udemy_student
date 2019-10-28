package com.Angus

fun main() {
    val list = listOf(5,1,2,7)
    println(list)
    var scores = listOf(68, 88, 77,90,50)
    for(score in scores){
        println(score)
    }

    var mutableList = mutableListOf(68, 88, 77,90,50)
    mutableList.add(1)
    println(mutableList)
}