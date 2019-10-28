package com.Angus;

import com.Angus.student.Report;

public class FinanceReport implements Report {

    @Override
    public void load() {
        System.out.println("Finance loading data");
    }

    @Override
    public void print() {
        System.out.println("Finance printing data");
    }
}
