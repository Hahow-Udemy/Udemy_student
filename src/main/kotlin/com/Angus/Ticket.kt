package com.Angus.Kotlin

import kotlin.random.Random

data class Ticket(var orignal : Int, var destination : Int, var price : Int)

fun main() {
    var ticket = Ticket(20, 48, 420)
    for (i in 1..100)
    println((1..10).random())

//    println((1..10).endInclusive)
//    println((1..10).start)


}

fun IntRange.random() : Int {
    var r = Random.nextInt(endInclusive - start  ) + start
    return r
}