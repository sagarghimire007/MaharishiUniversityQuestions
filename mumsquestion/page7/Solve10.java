package com.mumsquestion.page7;

/*
It is a fact that there exist two numbers x and y such that  x! + y! = 10!. Write a method named solve10  that returns the values x and y in an array.

The notation n! is called n factorial and is equal to n * n-1 * n-2 * ... 2 * 1, e.g.,  5! = 5*4*3*2*1 = 120.

If you are programming in Java or C#, the function prototype is
   int[ ] solve10() where the length of the returned array is 2.

If you are programming in C++ or C, the function prototype is
   int * solve10() where the length of the returned array is 2.

Please be sure that the method solve10 returns an array, a, with two elements
where a[0] == x, a[1] == y and x! + y! = 10!.

 */

import java.util.Arrays;

public class Solve10 {
    public static void main(String[] args) {

        int[] a = solve10();
        System.out.println(Arrays.toString(a));

    }

    public static int[] solve10() {

        int[] finalOutput = new int[2];
        int factorialOf10 = calculateFactorial(10);
        long sum = 0;
        for (int x = 1; x <= 10; x++) {
            for (int y = 1; y <= 10; y++) {
                sum = calculateFactorial(x) + calculateFactorial(y);
                if (sum > factorialOf10) {
                    break;
                }
                if (sum == factorialOf10) {
                    finalOutput[0] = x;
                    finalOutput[1] = y;
                    break;
                }
            }
        }
        return finalOutput;
    }

    private static int calculateFactorial(int n) {
        int fact = 1;
        while (n != 1) {
            if (n <= 1) {
                return 1;
            }
            fact = fact * n;
            n--;
        }
        return fact;
    }
}
