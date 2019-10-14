package com.Angus.guess;

import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Random random = new Random();
        int secret = random.nextInt(10) + 1;
        System.out.println(secret);
//        System.out.println(random.doubles(10));
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        while(number != secret){
            System.out.print("Please enter a number : ");
             number = scanner.nextInt();
            if(number < secret)
                System.out.print("higher");
            else if (number > secret)
                System.out.print("lower");
            else
                System.out.println("Great the number is :" + secret);
        }
//        dowhile();
    }

    private static void dowhile() {
        int i=0;
        do{
            System.out.println(i);
            i++;
        }while(i < 3);
    }
}
