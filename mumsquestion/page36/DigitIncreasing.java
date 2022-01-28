package com.mumsquestion.page36;

/*

A number is called digit-increasing if it is equal to n + nn + nnn + ... for some digit n between 1 and 9. For example 24 is digit-increasing
because it equals 2 + 22 (here n = 2)

Write a function called isDigitIncreasing that returns 1 if its argument is digit-increasing otherwise, it returns 0.
The signature of the method is
int isDigitIncreasing(int n)

 */

public class DigitIncreasing {

    public static void main(String[] args) {

        System.out.println(isDigitIncreasing(7404));
        System.out.println(isDigitIncreasing(24));
        System.out.println(isDigitIncreasing(7));
        System.out.println(isDigitIncreasing(36));
        System.out.println(isDigitIncreasing(984));
        System.out.println(isDigitIncreasing(0));

    }

    public static int isDigitIncreasing(int n) {

        if (n <= 0) {
            return 0;
        }

        int digit = 0, sum = 0;
        for (int i = 1; i <= 9; i++) {
            digit = 0;
            sum = 0;
            for (int j = 1; j <= 9; j++) {
                digit = digit + i * (int) Math.pow(10 , j - 1);
                sum = sum + digit;

                if (sum > n) {
                    break;
                }
                if (sum == n) {
                    return 1;
                }
            }

        }
        return 0;
    }
}
