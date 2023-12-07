package com.javarush.task.pro.task02.task0214;

import java.util.Scanner;

/* 
Чтение и преобразование строк
*/

public class Solution {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String text = console.nextLine();
        String text2 = console.nextLine();
        String text3 = console.nextLine();

        System.out.println(text3);
        System.out.println(text2.toUpperCase());
        System.out.println(text.toLowerCase());
    }
}
