package com.javarush.task.pro.task17.task1708;

/* 
Минимальное и максимальное
*/

public class MinMaxUtil {
    public static int min(int a, int b ) {


        return Math.min(a,b);

    }

    public static int min(int c,int d, int e) {

        return Math.min(Math.min(c,d),e);

    }

    public static int min(int f,int g,int h,int i) {

        return Math.min(Math.min(Math.min(f,g),h),i);
    }

    public static int min(int j,int k,int l,int m,int n) {

        return Math.min(Math.min(Math.min(Math.min(j,k),l),m),n);

    }

    public static int max(int o,int p) {

        return Math.max(o,p);

    }

    public static int max(int q,int r,int s) {

        return Math.max(Math.max(q,r),s);

    }

    public static int max(int t ,int u ,int w ,int x) {

        return Math.max(Math.max(Math.max(t,u),w),x);

    }

    public static int max(int y ,int z,int kik,int kok,int kak) {

        return Math.max(Math.max(Math.max(Math.max(y,z),kik),kok),kak);

    }

}
