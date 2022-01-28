package com.mumsquestion.page44;

/*
Define an array to be one-balanced if begins with zero or more 1s followed by zero or more non-1s and concludes with zero or more 1s.
Write a function named isOneBalanced that returns 1 if its array argument is one-balanced, otherwise it returns 0.
(Added  By fantus :  AND total 1’s equal to total  no’s of  non 1’s)

If you are programming in Java or C#, the function signature is
int isOneBalanced(int[ ] a)

If you are programming in C or C++, the function signature is
int isOneBalanced(int a[ ], int len) where len is the number of elements in the array a.

Examples: take index 1 and index 2 and manipulate ….

 */

public class OneBalanced {
    static int i;

    public static void main(String[] args) {

        System.out.println(isOneBalancedArray(new int[]{ 1 , 1 , 1 , 2 , 3 , -18 , 45 , 1 }));
        System.out.println(isOneBalancedArray(new int[]{ 1 , 1 , 1 , 2 , 3 , -18 , 45 , 1 , 0 }));
        System.out.println(isOneBalancedArray(new int[]{ 1 , 1 , 2 , 3 , 1 , -18 , 26 , 1 }));
        System.out.println(isOneBalancedArray(new int[]{}));
        System.out.println(isOneBalancedArray(new int[]{ 3 , 4 , 1 , 1 }));
        System.out.println(isOneBalancedArray(new int[]{ 1 , 1 , 3 , 4 }));
        System.out.println(isOneBalancedArray(new int[]{ 3 , 3 , 3 , 3 , 3 , 3 }));
        System.out.println(isOneBalancedArray(new int[]{ 1 , 1 , 1 , 1 , 1 , 1 }));

    }

    private static int isOneBalancedArray(int[] n) {

        int index1 = 0;
        int index2 = 0;

        for (i = 0; i < n.length; i++) {
            if (n[i] == 1) {
                continue;
            }
            if (n[i] != 1) {
                index1 = i;
                break;
            }
        }
//        System.out.println("index1: "+index1);
        for (i = index1; i < n.length; i++) {

            if (n[i] == 1) {
                index2 = i;
                break;
            } else {
                if (index1 == (n.length - index1)) {
                    return 1;
                }
            }
        }

        // checking last element as 1
        int c = 0;
        for (int i = index2; i < n.length; i++) {
            if (n[i] != 1) {
                return 0;
            }

            if (n[i] == 1) {
                c++;
            }
        }
//         System.out.println("last one count "+c);
        if (c == n.length - index2 && (n.length - index2 + index1) == (index2 - index1)) {
            return 1;
        }
        // System.out.println(index1+" , "+index2);
        return 0;
    }
}
