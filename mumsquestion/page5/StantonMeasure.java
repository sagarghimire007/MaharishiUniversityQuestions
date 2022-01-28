package com.mumsquestion.page5;

/*
The Stanton measure of an array is computed as follows. Count the number of 1s in the array. Let this count be n. The Stanton measure is the number
of times that n appears in the array. For example, the Stanton measure of {1, 4, 3, 2, 1, 2, 3, 2} is 3 because 1 occurs 2 times in the
array and 2 occurs 3 times.

Write a function named stantonMeasure that returns the Stanton measure of its array argument.

If you are  programming in Java or C#, the function prototype is
	int stantonMeasure(int[ ] a)

 */

public class StantonMeasure {
    public static void main(String[] args) {

        System.out.println(stantonMeasure(new int[]{ 1 }));
        System.out.println(stantonMeasure(new int[]{ 0 }));
        System.out.println(stantonMeasure(new int[]{ 3 , 1 , 1 , 4 }));
        System.out.println(stantonMeasure(new int[]{ 1 , 3 , 1 , 1 , 3 , 3 , 2 , 3 , 3 , 3 , 4 }));
        System.out.println(stantonMeasure(new int[]{}));
    }

    public static int stantonMeasure(int[] a) {
        if (a.length < 1) {
            return 0;
        }
        int countNumberOf1s = 0, numberOfOccurrence = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 1) {
                countNumberOf1s++;
            }
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] == countNumberOf1s) {
                numberOfOccurrence++;
            }
        }
        return numberOfOccurrence;
    }
}

