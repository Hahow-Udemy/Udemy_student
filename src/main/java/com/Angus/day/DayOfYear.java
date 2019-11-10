package com.Angus.day;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DayOfYear {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("please enter year: ");
            String yearString = reader.readLine();
            int year = Integer.parseInt(yearString);
            System.out.println(year);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
