package com.javarush.task.pro.task04.task0416;

import java.util.Scanner;

/* 
Share a Coke
*/

public class Solution {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int countСan = sc.nextInt();
       int countPeople = sc.nextInt();
       double division = 1.0 * countСan / countPeople;
        System.out.println(division);

    }
}