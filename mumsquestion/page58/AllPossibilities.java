package com.mumsquestion.page58;

/*

A non-empty array a of length n is called an array of all possibilities if it contains all numbers between 0 and a.length-1 inclusive.
Write a method named isAllPossibilities that accepts an integer array and returns 1 if the array is an array of all possibilities, otherwise it
returns 0.
If you are programming in Java or C#, the function signature is
int isAllPossibilities(int[ ] a)
If you are programming in C or C++, the function signature is
int isAllPossibilities(int a[ ], int len) where len is the number of elements in the array

 */
public class AllPossibilities {

    public static void main(String[] args) {
        System.out.println(isAllPossibilities(new int[]{ 1 , 2 , 0 , 3 }));
        System.out.println(isAllPossibilities(new int[]{ 3 , 2 , 0 , 1 }));
        System.out.println(isAllPossibilities(new int[]{ 1 , 2 , 3 , 4 }));
        System.out.println(isAllPossibilities(new int[]{ 0 , 2 , 3 }));
        System.out.println(isAllPossibilities(new int[]{ 0 }));
        System.out.println(isAllPossibilities(new int[]{}));
    }

    public static int isAllPossibilities(int[] a) {

        if (a.length < 1) {
            return 1;
        }
        for (int i = 0; i < a.length - 1; i++) {
            boolean elementsMatched = false;
            for (int j = 0; j < a.length; j++) {
                if (i == a[j]) {
                    elementsMatched = true;
                    break;
                }
            }
            if (elementsMatched == false) {
                return 0;
            }
        }
        return 1;
    }
}
