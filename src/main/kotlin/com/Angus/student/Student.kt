package com.Angus.Kotlin

fun main(args: Array<String>) {
    Student.test()
    var stu = Student("Angus2", 60, 99)
    var test =123
    val gstu = GraduateStudent("Jack", 55, 65, 60)
    gstu.print()
    stu.print()
    println("Test is : $test")
    println("High score : ${stu.highest()}")
}

class GraduateStudent(name: String?, english: Int, math: Int,var thesis : Int) : Student(name, english, math){
    companion object{
        var pass = 70
    }

    override fun print() {
//        super.print()
        println(" $name\t$english\t$math\t$thesis\t${getAverage()}\t${passOrFail()}\t${grading()} ")
    }

    override fun passOrFail(): String {
//        return super.passOrFail()
        return if (getAverage() >= pass)"Pass" else "Failed"
    }
}
open class Student(var name : String?, var english : Int, var math : Int){
    companion object{
        var pass = 60
        fun test(){
            println("testing")
        }
    }
    open fun print(){
        println(" $name\t$english\t$math\t${getAverage()}\t${passOrFail()}\t${grading()} ")
    }

    open fun passOrFail() = if (getAverage() >= pass)"Pass" else "Failed"

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