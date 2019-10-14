package com.Angus

import java.util.*

fun main(args: Array<String>) {
    val secret = Random().nextInt(10) + 1
    println(secret)
    var number = 0
//    val scanner = Scanner(System.`in`)
    while(number != secret){
        print("Please enter a number")
        number = readLine()!!.toInt()
//        number =  scanner.nextInt()
        if (number > secret){
            println("lower")
        } else if (number < secret){
            println("higher")
        } else {
            println("Great , the number is $secret")
        }
    }

}