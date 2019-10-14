package com.Angus

import java.util.*
import kotlin.random.Random

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val secret : Int = Random.nextInt(10) + 1
    println(secret)
    for (i in 1..5){
        var number = scanner.nextInt();
        println("Please enter the number (${i}/4): ")
        println("第${i}次: $number")
        if (secret > number)
            println("Higher")
        else if (secret < number)
            println("Lower")
        else{
            println("Great , the number is $number")
            break
        }
    }
    println("The coding is ending")
}