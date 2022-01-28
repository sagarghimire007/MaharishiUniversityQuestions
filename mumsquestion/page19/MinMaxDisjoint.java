package com.mumsquestion.page19;

/*
An array is defined to be minmax-disjoint if the following conditions hold:
a. The minimum and maximum values of the array are not equal.
b. The minimum and maximum values of the array are not adjacent to one another.
c. The minimum value occurs exactly once in the array.
d. The maximum value occurs exactly once in the array.

For example the array {5, 4, 1, 3, 2} is minmax-disjoint because
a. The maximum value is 5 and the minimum value is 1 and they are not equal.
b. 5 and 1 are not adjacent to one another
c. 5 occurs exactly once in the array
d. 2 occurs exactly once in the array

Write a function named isMinMaxDisjoint that returns 1 if its array argument is minmax-disjoint, otherwise it returns 0.

 */

public class MinMaxDisjoint {
    public static void main(String[] args) {
        System.out.println("Result 1 : " + isMinMaxDisjoint(new int[]{ 18 , -1 , 3 , 4 , 0 }));
        System.out.println("Result 2 : " + isMinMaxDisjoint(new int[]{ 5 , 4 , 1 , 3 , 2 }));
        System.out.println("Result 3 : " + isMinMaxDisjoint(new int[]{ 9 , 0 , 5 , 9 }));
        System.out.println("Result 4 : " + isMinMaxDisjoint(new int[]{ 0 , 5 , 18 , 0 , 9 }));
        System.out.println("Result 5 : " + isMinMaxDisjoint(new int[]{ 7 , 7 , 7 , 7 }));
        System.out.println("Result 6 : " + isMinMaxDisjoint(new int[]{}));
        System.out.println("Result 7 : " + isMinMaxDisjoint(new int[]{ 1 , 2 }));
        System.out.println("Result 8 : " + isMinMaxDisjoint(new int[]{ 2 , 2 }));
        System.out.println("Result 9 : " + isMinMaxDisjoint(new int[]{ 1 }));
    }

    public static int isMinMaxDisjoint(int[] a) {
        if (a.length <= 2) {
            return 0;
        }
        if (isMinMaxAdjacent(a)) {
            return 1;
        }
        return 0;
    }

    public static boolean isMinMaxAdjacent(int[] a) {

        int maxValuePosition = 0, minValuePosition = 0;
        int max = a[0], min = a[0];

        // finding max element in an array
        for (int i = 0; i < a.length; i++) {
            if (a[i] >= max) {
                max = a[i];
                maxValuePosition = i;
            }
            if (a[i] <= min) {
                min = a[i];
                minValuePosition = i;
            }
        }

        if (max != min) {
            if ((maxValuePosition - 1) == minValuePosition || (maxValuePosition + 1) == minValuePosition) {
                return false;
            }
            if (checkingMinMaxOccurrence(a , max , min)) {
                return true;
            }
        }
        return false;
    }

    private static boolean checkingMinMaxOccurrence(int[] a , int max , int min) {

        int minValueOccurrence = 0, maxValueOccurrence = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == max) {
                maxValueOccurrence++;
            }
            if (a[i] == min) {
                minValueOccurrence++;
            }
        }
        if (minValueOccurrence == 1 && maxValueOccurrence == 1) {
            return true;
        }
        return false;
    }
}
