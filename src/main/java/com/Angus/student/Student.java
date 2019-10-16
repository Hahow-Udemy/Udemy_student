package com.Angus.student;

public class Student {
    String id, name;
    int english, math;

    public Student(String name, int english, int math) {
        this.name = name;
        this.english = english;
        this.math = math;
    }

    public void print(){
        System.out.println(name + "\t" + english + "\t" + math + "\t" + (english+math)/2);
    }

    public int highest(){
        if(english > math)
            return english;
        else if (english < math)
            return math;
        else
            return math;
    }

    public int getAverage(){
        return (math + english)/2;
    }
}
