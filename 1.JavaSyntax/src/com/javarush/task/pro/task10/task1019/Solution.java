package com.javarush.task.pro.task10.task1019;

import java.util.Calendar;

/* 
Текущий год
*/

public class Solution {

    private int currentYear = Calendar.getInstance().get(Calendar.YEAR);

    public void Solution(int currentYear) {
        this.currentYear = currentYear;

    }

    public int getCurrentYear() {
        return currentYear;

    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.getCurrentYear());
    }
}
