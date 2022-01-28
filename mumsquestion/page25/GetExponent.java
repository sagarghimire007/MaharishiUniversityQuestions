package com.mumsquestion.page25;

/*
Write a method named getExponent(n, p) that returns the largest exponent x such that px evenly divides n. If p is <= 1 the method should return -1.

For example, getExponent(162, 3) returns 4 because 162 = 21 * 34, therefore the value of x here is 4.

The method signature is
int getExponent(int n, int p)

 */

public class GetExponent {
    public static void main(String[] args) {
        System.out.println("Result 1 : " + getExponent(162 , 3));
        System.out.println("Result 2 : " + getExponent(27 , 3));
        System.out.println("Result 3 : " + getExponent(28 , 3));
        System.out.println("Result 4 : " + getExponent(280 , 7));
        System.out.println("Result 5 : " + getExponent(-250 , 5));
        System.out.println("Result 6 : " + getExponent(18 , 1));
        System.out.println("Result 7 : " + getExponent(128 , 4));
        System.out.println("Result 8 : " + getExponent(0 , 3));
        System.out.println("Result 9 : " + getExponent(-9 , 3));
        System.out.println("Result 10 : " + getExponent(1 , 1));
        System.out.println("Result 11: " + getExponent(-9 , 3));

    }

    public static int getExponent(int n , int p) {
        if (p <= 1) {
            return -1;
        }
        if (n == 0) {
            return 0;
        }
        int count = 0, remainder = 0;
        while (n % p == 0) {
            remainder = n % p;
            n = n / p;
            if (remainder == 0) {
                count++;
            }
        }
        return count;
    }
}
