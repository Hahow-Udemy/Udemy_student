package com.Angus

import com.Angus.Kotlin.Student
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class StudentTest(){


    @Test
  fun gradingTest(){
        val student = Student("Angus", 80, 60)
        Assertions.assertEquals('C',student.grading())
    }


    @Test
    fun highestTest(){
        val student = Student("Angus2", 70, 60)
        Assertions.assertEquals(65, student.getAverage())
    }
}