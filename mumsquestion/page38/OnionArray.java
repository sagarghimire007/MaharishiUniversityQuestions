package com.mumsquestion.page38;

/*
An onion array is an array that satisfies the following condition for all values of j and k:
if j>=0 and k>=0 and j+k=length of array and j!=k then a[j]+a[k] <= 10

Write a function named isOnionArray that returns 1 if its array argument is an onion array and returns 0 if it is not.

Your solution must not use a nested loop (i.e., a loop executed from inside another loop). Furthermore, once you determine that the array is not
an onion array your function must return 0; no wasted loops cycles please!

If you are programming in Java or C#, the function signature is
int isOnionArray(int[ ] a)

 */

public class OnionArray {

    public static void main(String[] args) {

        System.out.println(isOnionArray(new int[]{ 1 , 2 , 19 , 4 , 5 }));
        System.out.println(isOnionArray(new int[]{ 1 , 2 , 3 , 4 , 15 }));
        System.out.println(isOnionArray(new int[]{ 1 , 3 , 9 , 8 }));
        System.out.println(isOnionArray(new int[]{ 2 }));
        System.out.println(isOnionArray(new int[]{}));
        System.out.println(isOnionArray(new int[]{ -2 , 5 , 0 , 5 , 12 }));

    }

    public static int isOnionArray(int[] a) {

        if (a.length < 2) {
            return 1;
        }
        int sum = 0;
        for (int i = 0; i < a.length / 2; i++) {
            sum = a[i] + (a[a.length - 1 - i]);
            if (sum > 10) {
                return 0;
            }
        }
        return 1;
    }
}
