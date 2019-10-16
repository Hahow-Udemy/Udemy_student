package com.Angus.Kotlin

fun main(args: Array<String>) {
    var stu = Student("Angus2", 60, 99)
    var test =123
    stu.print()
    println("Test is : $test")
    println("High score : ${stu.highest()}")
}

class Student(var name : String, var english : Int, var math : Int){
    fun print(){
        println(" $name\t$english\t$math\t${getAverage()}\t${passOrFail()}\t${grading()} ");
    }

    fun passOrFail() = if (getAverage() >= 60)"Pass" else "Failed"

    fun grading() : Char{
        var grading = when(getAverage()){
            in 90..100 -> 'A'
            in 80..89 -> 'B'
            in 70..79 -> 'C'
            in 60..69 -> 'D'
            else -> 'F'
        }
        return grading
    }

    fun highest() : Int{
        var max = if (english > math ){
            println("english")
            english
        }else{
            println("math")
            math
        }
        return max
    }

    fun getAverage() : Int{
        return (english + math)/2
    }
}