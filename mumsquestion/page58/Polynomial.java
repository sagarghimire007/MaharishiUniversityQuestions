package com.mumsquestion.page58;

/*
Write a function named eval that returns the value of the polynomial anxn + an-1xn-1 + ... + a1x1 + a0.
If you are programming in Java or C#, the function signature is
double eval(double x, int[ ] a)
If you are programming in C or C++, the function signature is
double eval(double x, int a[ ], int len) where len is the number of elements in the array

 */

public class Polynomial {
    public static void main(String[] args) {

        System.out.println(eval(1.0 , new int[]{ 0 , 1 , 2 , 3 , 4 }));
        System.out.println(eval(3.0 , new int[]{ 3 , 2 , 1 }));
        System.out.println(eval(2.0 , new int[]{ 3 , -2 , -1 }));
        System.out.println(eval(-3.0 , new int[]{ 3 , 2 , 1 }));
        System.out.println(eval(2.0 , new int[]{ 3 , 2 }));
        System.out.println(eval(2.0 , new int[]{ 4 , 0 , 9 }));
        System.out.println(eval(2.0 , new int[]{ 10 }));
        System.out.println(eval(10.0 , new int[]{ 0 , 1 }));
        System.out.println(eval(10.0 , new int[]{}));
    }

    public static double eval(double x , int[] a) {

        if (a.length < 1) {
            return 0;
        }
        double sum = 0;
        for (int i = a.length - 1; i >= 0; i--) {
            sum += a[i] * Math.pow(x , i);
        }
        return sum;
    }
}
