package com.javarush.task.pro.task04.task0414;

import java.util.Scanner;

/* 
Хорошего не бывает много
*/

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        int num = sc.nextInt();
        do {
            System.out.println(string);
            num--;
        }  while (num > 0 && num < 4);



    }
}