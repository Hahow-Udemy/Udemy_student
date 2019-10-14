package com.Angus.guess;

import java.util.Random;
import java.util.Scanner;

public class GameFor {
    public static void main(String[] args) {

        //random secret
        Random random = new Random();
        int secret = random.nextInt(10) + 1;
        System.out.println(secret);

        //scanner number

        for (int i = 1; i <= 4; i++){
            System.out.println("Please enter the numer :");
            Scanner scanner = new Scanner(System.in);
            int number = scanner.nextInt();
            System.out.print("第" + i + "次:" + number);
                if (secret > number)
                    System.out.println("Higher");
                else if (secret < number)
                    System.out.println("Lower");
                else{
                    System.out.println("Great , the secert is :" + secret);
                    break;
                }
        }
        System.out.println("The coding is ending");

    }
}
