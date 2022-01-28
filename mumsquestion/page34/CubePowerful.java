package com.mumsquestion.page34;

/*

A number n>0 is called cube-powerful if it is equal to the sum of the cubes of its digits.

Write a function named isCubePowerful that returns 1 if its argument is cube-powerful; otherwise it returns 0.

The function prototype is
int isCubePowerful(int n);

Hint: use modulo 10 arithmetic to get the digits of the number.

 */

public class CubePowerful {
    public static void main(String[] args) {

        System.out.println(isCubePowerfulWithMath(153));
        System.out.println(isCubePowerful(370));
        System.out.println(isCubePowerful(371));
        System.out.println(isCubePowerful(407));
        System.out.println(isCubePowerful(87));
        System.out.println(isCubePowerful(0));
        System.out.println(isCubePowerful(-81));

    }

    // without using Math library
    public static int isCubePowerful(int n) {

        if (n <= 0) {
            return 0;
        }
        int number = n;
        int remainder = 0, cubeSum = 0;
        while (number != 0) {
            remainder = number % 10;
            number = number / 10;
            cubeSum += cubeMultiples(remainder);
        }
        if (cubeSum == n) {
            return 1;
        }
        return 0;
    }

    public static int cubeMultiples(int n) {

        int sum = 1;
        for (int i = 1; i <= 3; i++) {
            sum = sum * n;
        }
        return sum;
    }

    // using with Math library
    public static int isCubePowerfulWithMath(int n) {

        int number = n;
        int remainder = 0, sum = 0;
        while (number != 0) {
            remainder = number % 10;
            number = number / 10;
            sum += Math.pow(remainder , 3);
        }
        if (sum == n) {
            return 1;
        }
        return 0;
    }
}
