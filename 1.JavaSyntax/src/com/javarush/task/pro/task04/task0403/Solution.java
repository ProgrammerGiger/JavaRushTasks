package com.javarush.task.pro.task04.task0403;

import java.util.Scanner;

/* 
Суммирование
*/

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        boolean exit = false;
        while (!exit) {
            if (sc.hasNextInt()) {
                sum = sum + sc.nextInt();
            } else if (sc.hasNextLine()) {
                exit = sc.nextLine().equals("ENTER");
            }


        }
        System.out.println(sum);


    }
}