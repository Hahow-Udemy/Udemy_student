package com.Angus.day;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;

public class DayOfYear {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Calendar now = Calendar.getInstance();
        int defaultYear = now.get(Calendar.YEAR);
        int defaultMonth = now.get(Calendar.MONTH) + 1;
        int defaultDay = now.get(Calendar.DAY_OF_MONTH);
        try {
            //year
            System.out.println("please enter year: ");
            String yearString = reader.readLine();
            int year = yearString.length()== 0? defaultYear : Integer.parseInt(yearString);
            System.out.println(year);
            //month
            System.out.println("please enter month: ");
            String monthString = reader.readLine();
            int month = monthString.length() == 0? defaultMonth : Integer.parseInt(monthString);
            System.out.println(month);
            //day
            System.out.println("please enter day: ");
            String dayString = reader.readLine();
            int day = dayString.length() == 0? defaultDay : Integer.parseInt(dayString);
            System.out.println(day);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
