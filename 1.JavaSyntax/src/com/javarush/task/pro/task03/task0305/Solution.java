package com.javarush.task.pro.task03.task0305;

import java.util.Scanner;

/* 
Три числа
*/

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int number2 = sc.nextInt();
        int number3 = sc.nextInt();

        if (number == number2 && number != number3)
            System.out.println(number + " " + number2);
        else if (number == number3 && number != number2)
            System.out.println(number + " " + number3);
        else if (number2 == number3 && number2 != number)
            System.out.println(number2 + " " + number3);
        else if (number == number2 && number == number3)
            System.out.println(number + " " + number2 + " " + number3);

    }
}
