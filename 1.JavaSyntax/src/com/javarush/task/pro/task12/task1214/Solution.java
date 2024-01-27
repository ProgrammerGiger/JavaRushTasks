package com.javarush.task.pro.task12.task1214;

import java.util.ArrayList;
import java.util.Arrays;

/* 
Прощай, Паскаль
*/

public class Solution {
    public static ArrayList<String> programmingLanguages = new ArrayList<>(Arrays.asList("C", "C++", "Python", "JavaScript", "Ruby", "Java", "Pascal"));

    public static void main(String[] args) {
      programmingLanguages.removeIf(element -> element.equalsIgnoreCase("Pascal"));
     //   ArrayList<String> prog = programmingLanguages;
     //   System.out.println(prog.toString());

    }
}
