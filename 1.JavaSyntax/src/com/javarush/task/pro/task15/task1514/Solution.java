package com.javarush.task.pro.task15.task1514;

import java.nio.file.Path;
import java.util.Scanner;

/* 
Все относительно
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
           Path path1 = Path.of(scanner.nextLine());
           Path path2 = Path.of(scanner.nextLine());
           Path result = path1.relativize(path2);
           System.out.println(result);
       } catch (Exception e) {

       }
    }
}

