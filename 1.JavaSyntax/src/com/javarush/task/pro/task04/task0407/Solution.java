package com.javarush.task.pro.task04.task0407;

/* 
Сумма чисел, не кратных 3
*/

public class Solution {
    public static void main(String[] args) {
        int num = 0;
        int sum = 0;
        while (num <= 100 ) {
            num++;
            sum = num + sum;
            if ((sum % 3) == 0)
                continue;
                System.out.println(sum);

        }

    }
}