package com.mumsquestion.page56;

/*

Write a function named allValuesTheSame that returns 1 if all elements of its argument array have the same value. Otherwise, it returns 0.
If you are programming in Java or C#, the function signature is
int allValuesTheSame(int[ ] a)
If you are programming in C or C++, the function signature is
int allValuesTheSame(int a[ ], int len) where len is the number of elements in a

 */

public class AllValuesTheSame {
    public static void main(String[] args) {

        System.out.println(allValuesTheSame(new int[]{ 1 , 1 , 1 , 1 }));
        System.out.println(allValuesTheSame(new int[]{ 83 , 83 , 83 }));
        System.out.println(allValuesTheSame(new int[]{ 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 }));
        System.out.println(allValuesTheSame(new int[]{ 1 , -2343456 , 1 , -2343456 }));
        System.out.println(allValuesTheSame(new int[]{ 0 , 0 , 0 , 0 , -1 }));
        System.out.println(allValuesTheSame(new int[]{ 432123456 }));
        System.out.println(allValuesTheSame(new int[]{ -432123456 }));
        System.out.println(allValuesTheSame(new int[]{}));
    }

    public static int allValuesTheSame(int[] a) {

        if (a.length < 1) {
            return 0;
        }
        int element = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] != element) {
                return 0;
            }
        }
        return 1;
    }
}
