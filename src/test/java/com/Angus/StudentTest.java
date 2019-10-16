package com.Angus;

import com.Angus.student.Student;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StudentTest {

     @Test
    public void highScoreTest(){
        Student student = new Student("Angus", 80, 60);
        Assertions.assertEquals(80, student.highest());
    }

    @Test
    void getAverageTest(){
         Student student = new Student("Angus", 80, 60);
         Assertions.assertEquals(70, student.getAverage());
    }
}
