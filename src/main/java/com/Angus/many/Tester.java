package com.Angus.many;

import java.util.*;

public class Tester {
    public static void main(String[] args) {
//        Map
        HashMap<String, String> stocks = new HashMap<>();
        stocks.put("2330", "台積電");
        stocks.put("2317","鴻海");
        stocks.put("2330", "TSMC");
        System.out.println(stocks);

        for(String key : stocks.keySet()){
            System.out.println(stocks.get(key));
        }
//        set();
//        arrayTest();
//        list();
    }

    private static void set() {
        //set
        HashSet<Integer> set = new HashSet<>();
        set.add(6);
        set.add(7);
        set.add(1);
        set.add(8);
        set.add(7);
        System.out.println(set);
        for (int n : set){
            System.out.println(n);
        }
    }

    private static void list() {
        ArrayList<Integer> list = new ArrayList();
        list.add(5);
        list.add(3);
        list.add(1);
        list.add(7);
        System.out.println(list);
        int n1 = list.get(0);
        int n2 = list.get(3);
        System.out.println(list.size());
        List<Integer> scores = Arrays.asList(68,88,78,90,50);
        for (int score : scores){
            System.out.println(score);
        }
    }

    private static void arrayTest() {
        int [] numbers  = new int [5];
        numbers[0] = 5;
        numbers[4] = 3;
//        numbers[5] = 7;//ArrayIndexOutOfBoundsException
        int[] scores = {68,88,78,99,50};
        System.out.println(scores);//located
        for(int i=0; i <= scores.length-1; i++){
            System.out.println(scores[i]);
        }

        //for each
        for(int n : scores){
            System.out.println(n);
        }
    }
}
