package com.javarush.task.pro.task03.task0308;

import java.util.Scanner;

/* 
Координатные четверти
*/

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        boolean belonging = x > 0 && y > 0;
        boolean belonging2 = x < 0 && y > 0;
        boolean belonging3 = x < 0 && y < 0;
        boolean belonging4 = x > 0 && y < 0;

        if (belonging)
            System.out.println("1");
        else if (belonging2)
            System.out.println("2");
        else if (belonging3)
            System.out.println("3");
        else if (belonging4)
            System.out.println("4");



    }
}
