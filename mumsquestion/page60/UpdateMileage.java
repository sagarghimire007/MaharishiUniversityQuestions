package com.mumsquestion.page60;

/*
Mileage Update
 */

import java.util.Arrays;

public class UpdateMileage {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(updateMileage(new int[]{ 8 , 9 , 9 , 5 , 0 } , 1)));
        System.out.println(Arrays.toString(updateMileage(new int[]{ 8 , 9 , 9 , 5 , 0 } , 2)));
        System.out.println(Arrays.toString(updateMileage(new int[]{ 9 , 9 , 9 , 9 , 9 , 9 , 9 , 9 , 9 , 9 } , 1)));
        System.out.println(Arrays.toString(updateMileage(new int[]{ 9 , 9 , 9 , 9 , 9 , 9 , 9 , 9 , 9 , 9 } , 13)));

    }

    public static int[] updateMileage(int[] a , int mile) {

        int digit = 0;
        int begin = mile;
        for (int i = 0; i < a.length; i++) {
            digit = a[i] + begin;
            if (digit < 10) {
                a[i] = digit;
                begin = 0;
            } else {
                a[i] = digit % 10;
                begin = digit / 10;
            }
        }
        return a;
    }
}
