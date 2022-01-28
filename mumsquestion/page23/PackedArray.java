package com.mumsquestion.page23;

/*
Define an array to be packed if all its values are positive, each value n appears n times and all equal values are in consecutive locations.
So for example, {2, 2, 3, 3, 3} is packed because 2 appears twice and 3 appears three times. But {2, 3, 2, 3, 3} is not packed because the 2s are
not in consecutive locations. And {2, 2, 2, 3, 3, 3} is not packed because 2 appears three times.

Write a method named isPacked that returns 1 if its array argument is packed, otherwise it returns 0. You may assume that the array is not null
If you are programming in Java or C#, the function signature is
int isPacked(int[ ] a)

 */
public class PackedArray {
    public static void main(String[] args) {
        System.out.println("Result 1 : " + isPacked(new int[]{ 2 , 2 , 3 , 3 , 3 }));
        System.out.println("Result 2 : " + isPacked(new int[]{ 2 , 3 , 2 , 3 , 3 }));
        System.out.println("Result 3 : " + isPacked(new int[]{ 2 , 2 , 2 , 3 , 3 , 3 }));
        System.out.println("Result 4 : " + isPacked(new int[]{ 4 , 4 , 4 , 4 , 1 , 2 , 2 , 3 , 3 , 3 }));
        System.out.println("Result 5 : " + isPacked(new int[]{ 7 , 7 , 7 , 7 , 7 , 7 , 7 , 1 }));
        System.out.println("Result 6 : " + isPacked(new int[]{ 7 , 7 , 7 , 7 , 1 , 7 , 7 , 7 }));
        System.out.println("Result 7 : " + isPacked(new int[]{ 7 , 7 , 7 , 7 , 7 , 7 , 7 }));
        System.out.println("Result 8 : " + isPacked(new int[]{}));
        System.out.println("Result 9 : " + isPacked(new int[]{ 1 , 2 , 1 }));
        System.out.println("Result 10: " + isPacked(new int[]{ 2 , 1 , 1 }));
        System.out.println("Result 11: " + isPacked(new int[]{ -3 , -3 , 3 }));
        System.out.println("Result 12: " + isPacked(new int[]{ 0 , 2 , 2 }));
        System.out.println("Result 13: " + isPacked(new int[]{ 2 , 1 , 2 }));
    }

    public static int isPacked(int[] a) {

        if (a.length < 1) {
            return 1;
        }
        if (hasAllPositiveValue(a) && areSameElementInConsecutive(a) && eachValueOccurrence(a)) {
            return 1;
        }
        return 0;
    }

    public static boolean hasAllPositiveValue(int[] a) {

        for (int i = 0; i < a.length; i++) {
            if (a[i] <= 0) {
                return false;
            }
        }
        return true;
    }

    // checking each n value of appearance n times
    public static boolean eachValueOccurrence(int[] a) {

        int countOccurrence = 1;
        int consecutiveElement = a[0];

        for (int i = 1; i < a.length; i++) {
            if (consecutiveElement == a[i]) {
                countOccurrence++;
                continue;
            }
            if (countOccurrence != consecutiveElement) {
                return false;
            }
            consecutiveElement = a[i];
            countOccurrence = 1;
        }
        return true;
    }

    // whether same elements are in consecutive location or not
    public static boolean areSameElementInConsecutive(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    if (i + 1 == j) {
                        break;
                    }
                    return false;
                }
            }
        }
        return true;
    }
}
