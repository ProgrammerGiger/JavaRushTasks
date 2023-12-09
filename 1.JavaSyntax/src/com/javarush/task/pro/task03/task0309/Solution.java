package com.javarush.task.pro.task03.task0309;

import java.util.Scanner;

/* 
Ищем максимум
*/

public class Solution {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int numberA = console.nextInt();
        int numberB = console.nextInt();

        int ternarn = numberA > numberB ? numberA : numberB;
        System.out.println(ternarn);
    }
}
