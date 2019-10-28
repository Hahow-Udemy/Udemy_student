package com.Angus;

import com.Angus.student.Report;

public class HealthReport implements Report {
    @Override
    public void load() {
        System.out.println("Health loading data");
    }

    @Override
    public void print() {
        System.out.println("Health printing data");
    }
}
