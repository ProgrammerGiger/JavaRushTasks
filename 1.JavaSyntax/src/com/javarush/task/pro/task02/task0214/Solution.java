package com.javarush.task.pro.task02.task0214;

import java.util.Scanner;

/* 
Чтение и преобразование строк
*/

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String name2 = sc.nextLine();
        String name3 = sc.nextLine();

        System.out.println(name3);
        System.out.println(name2.toUpperCase());
        System.out.println(name.toLowerCase());


    }
}
