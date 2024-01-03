package com.javarush.task.pro.task05.task0505;

import java.util.Scanner;

/* 
Reverse
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int[] array = new int[num];
        if ((num % 2) != 0) {
            for (int i = 0; i < array.length; i++) {
                array[i] = scan.nextInt();
            }
            for (int i = 0; i <= num - 1; i++) {
                System.out.println(array[i]);
            }
       }
        else {
            for (int i = 0; i < array.length; i++) {
                array[i] = scan.nextInt();
            }
            for (int i = num - 1; i >= 0; i--) {
                System.out.println(array[i]);

            }


        }
    }


}



