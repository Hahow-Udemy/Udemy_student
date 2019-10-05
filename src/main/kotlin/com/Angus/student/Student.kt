package com.Angus.student

fun main(args: Array<String>) {
    var stu = Student("Angus2", 60, 90)
    stu.print()
}

class Student(var name : String, var english : Int, var math : Int){
    fun print(){
        println(name + "\t" + english + "\t" + math + "\t" + (english+math)/2);
    }
}