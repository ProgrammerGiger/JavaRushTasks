package com.javarush.task.pro.task16.task1601;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.logging.SimpleFormatter;

/* 
Лишь бы не в понедельник :)
*/

public class Solution {

    static Date birthDate = new Date(96,Calendar.AUGUST,17) ;

    public static void main(String[] args) {
        System.out.println(getDayOfWeek(birthDate));
    }

    static String getDayOfWeek(Date date) {
        SimpleDateFormat format = new SimpleDateFormat("EEEE",new Locale("ru") );

        return format.format(date);
    }
}
