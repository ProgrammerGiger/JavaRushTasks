package com.javarush.task.pro.task05.task0504;

/* 
Объединяем массивы
*/

public class Solution {
    public static int[] firstArray = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    public static int[] secondArray = new int[]{10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
    public static int[] resultArray;

    public static void main(String[] args) {
        resultArray = new int[firstArray.length + secondArray.length];
        for (int j = 0; j < firstArray.length; j++) {
            resultArray[j] = firstArray[j];

        }
        for (int k = 0; k < secondArray.length; k++) {
            resultArray[firstArray.length + k] = secondArray[k];

        }
        for (int i = 0; i < resultArray.length; i++)
                    System.out.print(resultArray[i] + ", ");
            }
        }

