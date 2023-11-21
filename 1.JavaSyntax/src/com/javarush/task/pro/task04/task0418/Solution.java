package com.javarush.task.pro.task04.task0418;

import java.util.Scanner;

/* 
Стакан наполовину пуст или наполовину полон?
*/

public class Solution {
    public static void main(String[] args) {
        double glass = 0.5;
        Scanner sc = new Scanner(System.in);
        boolean bool = sc.nextBoolean();
        if (bool == false) {
            int down = (int)Math.floor(glass);
            System.out.println(down);
        } else if (bool == true) {
            int up = (int)Math.ceil(glass);
            System.out.println(up);

        }

    }
}