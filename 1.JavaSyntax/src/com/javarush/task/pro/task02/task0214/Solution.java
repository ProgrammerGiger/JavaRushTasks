package com.javarush.task.pro.task02.task0214;

import java.util.Scanner;

/* 
Чтение и преобразование строк
*/

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String string1 = scan.nextLine().toLowerCase();
        String string2 = scan.nextLine().toUpperCase();
        String string3 = scan.nextLine();
        System.out.println(string3);
        System.out.println(string2);
        System.out.println(string1);

    }
}
