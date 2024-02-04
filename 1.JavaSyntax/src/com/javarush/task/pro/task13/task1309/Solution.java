package com.javarush.task.pro.task13.task1309;

import java.util.HashMap;

/* 
Успеваемость студентов
*/

public class Solution {
    public static HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
        addStudents();
        System.out.println(grades);
    }

    public static void addStudents() {
        grades.put("Дмитрий Сутормин",4.5);
        grades.put("Денис Седых",4.6);
        grades.put("Юрий Кушминцев",4.4);
        grades.put("Антон Белявкин",4.3);
        grades.put("Дмитрий Комаров",5.0);
    }
}
