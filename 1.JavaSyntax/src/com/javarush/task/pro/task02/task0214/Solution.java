package com.javarush.task.pro.task02.task0214;

import java.util.Scanner;

/* 
Чтение и преобразование строк
*/

public class Solution {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String phrase = console.nextLine();
        String phrase2 = console.nextLine();
        String phrase3 = console.nextLine();

        System.out.println(phrase3);
        System.out.println(phrase2.toUpperCase());
        System.out.println(phrase.toLowerCase());
    }
}
