package com.javarush.task.pro.task03.task0305;

import java.util.Scanner;

/* 
Три числа
*/

public class Solution {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int number = console.nextInt();
        int number2 = console.nextInt();
        int number3 = console.nextInt();
        boolean numberEquals1 = number == number2 && number != number3;
        boolean numberEquals2 = number == number3 && number != number2;
        boolean numberEquals3 = number2 == number3 && number2 != number;
        boolean numberEquals4 = number == number2 && number == number3;

        if (numberEquals1)
            System.out.println(number + " " + number2);
        else if (numberEquals2)
            System.out.println(number + " " + number3);
        else if (numberEquals3)
            System.out.println(number2 + " " + number3);
        else if (numberEquals4)
            System.out.println(number + " " + number2 + " " + number3);

    }
}
