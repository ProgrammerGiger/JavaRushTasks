package com.javarush.task.pro.task09.task0907;

import java.util.regex.Pattern;

/* 
Шестнадцатеричный конвертер
*/

public class Solution {
    private static final String HEX = "0123456789abcdef";

    public static void main(String[] args) {
        int decimalNumber = 1256;
        System.out.println("Десятичное число " + decimalNumber + " равно шестнадцатеричному числу " + toHex(decimalNumber));
        String hexNumber = "4e8";
        System.out.println("Шестнадцатеричное число " + hexNumber + " равно десятичному числу " + toDecimal(hexNumber));
    }

    public static String toHex(int decimalNumber) {
        if (decimalNumber > 0) {
            String hexNum = "";
            while (decimalNumber != 0) {
                int index = decimalNumber % 16;
                hexNum = HEX.charAt(index) + hexNum;
                decimalNumber = decimalNumber / 16;
            }
            return hexNum;
        } else {
            return "";
        }
    }

    public static int toDecimal(String hexNumber) {
        if (hexNumber != null) {
            int decimalNum = 0;
            for (int i = 0; i < hexNumber.length(); i++) {
                int index = HEX.indexOf(hexNumber.charAt(i));
                decimalNum = 16 * decimalNum + index;
            }
            return decimalNum;
        } else {
            return 0;
        }
    }
}
