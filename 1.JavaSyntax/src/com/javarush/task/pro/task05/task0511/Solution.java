package com.javarush.task.pro.task05.task0511;

import java.util.Arrays;
import java.util.Scanner;

/* 
Создаем двумерный массив
*/

public class Solution {
    public static int[][] multiArray;

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int num = console.nextInt();
        multiArray = new int[num][];
        for (int i = 0; i < num; i++) {
            int num2 = console.nextInt();
            multiArray[i] = new int[num2];


        }
        System.out.println(Arrays.deepToString(multiArray));
    }
}
