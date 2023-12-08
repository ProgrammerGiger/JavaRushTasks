package com.javarush.task.pro.task03.task0306;

import java.util.Scanner;

/* 
Треугольник
*/

public class Solution {
    private static final String TRIANGLE_EXISTS = "треугольник существует";
    private static final String TRIANGLE_NOT_EXISTS = "треугольник не существует";

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int length = console.nextInt();
        int length2 = console.nextInt();
        int length3 = console.nextInt();

        boolean lengthLess = (length < (length2 + length3))
                && (length2 < (length + length3))  &&
                (length3 < (length2 + length));
        boolean lengthMore = (length >= (length2 + length3) ||
                length2 >= (length + length3)
                || length3 <= (length + length2));
        if (lengthLess)
            System.out.println(TRIANGLE_EXISTS);
         else if (lengthMore)
            System.out.println(TRIANGLE_NOT_EXISTS);

    }
}
