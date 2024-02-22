package com.javarush.task.pro.task16.task1604;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

/* 
День недели рождения твоего
*/

public class Solution {

    static Calendar birthDate = new GregorianCalendar(1996, Calendar.AUGUST, 17);

    public static void main(String[] args) {
        System.out.println(getDayOfWeek(birthDate));
    }

    static String getDayOfWeek(Calendar calendar) {


        String str = "";
        int day = calendar.get(Calendar.DAY_OF_WEEK);
        switch (day) {
            case 1:
                str = "Воскресенье";
                break;
            case 2:
                str = "Понедельник";
                break;
            case 3:
                str = "Вторник";
                break;
            case 4:
                str = "Среда";
                break;
            case 5:
                str = "Четверг";
                break;
            case 6:
                str = "Пятница";
                break;
            case 7:
                str = "Суббота";
                break;
        }
        return str;
    }
}
