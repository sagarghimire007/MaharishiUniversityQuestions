package com.mumsquestion.page48;


/*
Write a method named computeHMS that computes the number of hours, minutes and seconds in a given number of seconds.

If you are programming in Java or C#, the method signature is
int[] computeHMS(int seconds);

If you are programming in C or C++, the method signature is
int * computeHMS(int seconds);

The returned array has 3 elements; arr[0] is the hours, arr[1] is the minutes and arr[2] is the seconds contained within the seconds argument.

Recall that there are 3600 seconds in an hour and 60 seconds in a minute. You may assume that the numbers of seconds is non-negative.


 */

import java.util.Arrays;

public class ComputeHMS {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(computeHMS(75)));
        System.out.println(Arrays.toString(computeHMS(3735)));
        System.out.println(Arrays.toString(computeHMS(380)));
        System.out.println(Arrays.toString(computeHMS(3650)));
        System.out.println(Arrays.toString(computeHMS(55)));
        System.out.println(Arrays.toString(computeHMS(0)));
    }

    public static int[] computeHMS(int n) {

        int[] time = new int[3];
        int hour = n / 3600;
        n = n % 3600;
        int minute = n / 60;
        n = n % 60;
        time[0] = hour;
        time[1] = minute;
        time[2] = n;
        return time;
    }
}
