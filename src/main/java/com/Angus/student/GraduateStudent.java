package com.Angus.student;

public class GraduateStudent extends Student{
    int thesis;
    static int pass = 70;
    //constructor
    public GraduateStudent(String name, int english, int math, int thesis) {
        super(name, english, math);
        this.thesis = thesis;
    }

    @Override
    public void print() {
//        super.print();
        System.out.println(name + "\t" + english + "\t" + math + "\t" + thesis + "\t" +(english+math)/2 + "\t" +((getAverage() >= pass) ? "PASS" : "FAIL"));
    }
}
