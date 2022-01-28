package com.mumsquestion.page18;

/*

An integer array is defined to be sequentially-bounded if it is in ascending order and each value, n,  in the array  occurs less than n times in the
array. So {2, 3, 3, 99, 99, 99, 99, 99} is sequentially-bounded because it is in ascending order and the value 2 occurs less than 2 times, the
value 3 occurs less than 3 times and the value 99 occurs less than 99 times. On the other hand, the array {1, 2, 3} is not sequentially-bounded
because the value 1 does not occur < 1 times. The array {2, 3, 3, 3, 3} is not sequentially-bounded because the maximum allowable occurrences of
3 is 2 but 3 occurs 4 times. The array {12, 12, 9} is not sequentially-bounded because it is not in ascending order.

Write a function named isSequentiallyBounded that returns 1 if its array argument is sequentially-bounded, otherwise it returns 0.
• If you are programming in Java or C#, the funct2ion signature is int isSequentiallyBounded(int[ ] a)
• If you are programming in C or C++,  the function signature is  int isSequentiallyBounded(int a[ ], int len) where len is the length of the array.

 */

public class SequentialBounded {
    public static void main(String[] args) {
        System.out.println("Result 1 : " + isSequentiallyBounded(new int[]{ 2 , 3 , 3 , 99 , 99 , 99 , 99 , 99 , 99 }));
        System.out.println("Result 2 : " + isSequentiallyBounded(new int[]{ 1 , 2 , 3 }));
        System.out.println("Result 3 : " + isSequentiallyBounded(new int[]{ 2 , 3 , 3 , 3 , 3 }));
        System.out.println("Result 4 : " + isSequentiallyBounded(new int[]{ 12 , 12 , 9 }));
        System.out.println("Result 5 : " + isSequentiallyBounded(new int[]{ 0 , 1 }));
        System.out.println("Result 6 : " + isSequentiallyBounded(new int[]{ -1 , 2 })); // if array contains negative number, return 0
        System.out.println("Result 7 : " + isSequentiallyBounded(new int[]{})); // since there are no values, there are none that can fail the test
        System.out.println("Result 8 : " + isSequentiallyBounded(new int[]{ 5 , 5 , 5 , 5 })); // 5 occurs less than 5
        System.out.println("Result 9 : " + isSequentiallyBounded(new int[]{ 5 , 5 , 5 , 2 , 5 })); // not in ascending


    }

    public static int isSequentiallyBounded(int[] a) {

        if (a.length < 1) {
            return 1;
        }
        if (a[0] <= 1) {
            return 0;
        }

        int numberOfOccurrence;
        int isSequential = 0;
        if (isArrayInAscendingOrder(a)) {
            for (int i = 0; i < a.length - 1; i++) {
                numberOfOccurrence = 1;
                for (int j = i + 1; j < a.length; j++) {
                    if (a[i] == a[j]) {
                        numberOfOccurrence++;
                    }
                }
                if (numberOfOccurrence >= a[i]) {
                    return 0;
                }
            }
            isSequential = 1;
        }
        return isSequential;
    }

    private static boolean isArrayInAscendingOrder(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1] || a[i] < 0) {
                return false;
            }
        }
        return true;
    }
}
