package com.Angus.student;

public class StudentRunner {
    public static void main(String[] args) {
        Student stu = new Student("Angus",
                60, 90);
        Student stu2 = new Student("Hank",
                60, 40);
        Student stu3 = new Student("Eric",
                30, 55);
        GraduateStudent gstu = new GraduateStudent("Jack",
                55, 65, 60);
        gstu.print();
        stu.print();
        stu2.print();
        stu3.print();
    }
}
