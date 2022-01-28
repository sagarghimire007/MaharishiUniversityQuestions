package com.mumsquestion.page21;

/*
Define an array to be a railroad-tie array if the following three conditions hold

a. The array contains at least one non-zero element
b. Every non-zero element has exactly one non-zero neighbor
c. Every zero element has two non-zero neighbors.

For example, {1, 2, 0, 3, -18, 0, 2, 2} is a railroad-tie array because

a[0] = 1 has exactly one non-zero neighbor (a[1])
a[1] = 2 has exactly one non-zero neighbor (a[0])
a[2] = 0 has two non-zero neighbors (a[1] and a[3])
a[3] = 3 has exactly one non-zero neighbor (a[4])
a[4] = -18 has exactly one non-zero neighbor (a[3])
a[5] = 0 has two non-zero neighbors (a[4] and a[6])
a[6] = 2 has exactly one non-zero neighbor (a[7])
a[7] = 2 has exactly one non-zero neighbor (a[6])

The following are not railroad-tie arrays

{1, 2, 3, 0, 2, 2}, because a[1]=2 has two non-zero neighbors.
{0, 1, 2, 0, 3, 4}, because a[0]=0 has only one non-zero neighbor (it has no left neighbor)
{1, 2, 0, 0, 3, 4}, because a[2]=0 has only one non-zero neighbor (a[1])
{1}, because a[0]=1 does not have any non-zero neighbors.
{}, because the array must have at least one non-zero element
{0}, because the array must have at lease one non-zero element.

Write a function named isRailroadTie which returns 1 if its array argument is a railroad-tie array; otherwise it returns 0.

If you are writing in Java or C#, the function signature is
int isRailroadTie(int[ ] a)

 */

public class RailRoadTie {
    public static void main(String[] args) {

        System.out.println("Result 1 : " + isRailRoadTie(new int[]{ 1 , 2 , 0 , 3 , -18 , 0 , 2 , 2 }));
        System.out.println("Result 2 : " + isRailRoadTie(new int[]{ -1 , -2 , 0 , -3 , -18 , 0 , -2 , -2 })); // at least one non zero element... if
        // it is negative number it is non zero element
        System.out.println("Result 3 : " + isRailRoadTie(new int[]{ 1 , 2 , 3 , 0 , 2 , 2 , 2 }));
        System.out.println("Result 4 : " + isRailRoadTie(new int[]{ 0 , 1 , 2 , 0 , 3 , 4 }));
        System.out.println("Result 5 : " + isRailRoadTie(new int[]{ 1 , 2 , 0 , 0 , 3 , 4 }));
        System.out.println("Result 6 : " + isRailRoadTie(new int[]{ 1 }));
        System.out.println("Result 7 : " + isRailRoadTie(new int[]{}));
        System.out.println("Result 8 : " + isRailRoadTie(new int[]{ 0 }));
        System.out.println("Result 9 : " + isRailRoadTie(new int[]{ 1 , 2 }));
        System.out.println("Result 10: " + isRailRoadTie(new int[]{ 1 , 2 , 0 , 1 , 2 , 0 , 1 , 2 }));
        System.out.println("Result 11: " + isRailRoadTie(new int[]{ 3 , 3 , 0 , 3 , 3 , 3 , 0 , 3 , 3 , 0 , 3 , 3 }));
        System.out.println("Result 12: " + isRailRoadTie(new int[]{ 0 , 0 , 0 , 0 })); // all zero elements... must have at least one non zero elements
        System.out.println("Result 13: " + isRailRoadTie(new int[]{ 1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 , 10 }));
        System.out.println("Result 14: " + isRailRoadTie(new int[]{ 1 , 3 , 0 , 3 , 5 , 0 }));

    }

    public static int isRailRoadTie(int[] array) {

        if (array.length <= 1) {
            return 0;
        }

        // checking at least one element as non-zero

        if (hasAtLeastOneNonZeroElement(array)) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] != 0) {
                    if (!nonZeroHas1NonZeroNeighbour(array , i)) {
                        return 0;
                    }
                }
                if (array[i] == 0) {
                    if (!ZeroHas2NonZeroNeighbour(array , i)) {
                        return 0;
                    }
                }
            }
            return 1;
        }
        return 0;
    }

    // array elements that has at least one non zero element

    public static boolean hasAtLeastOneNonZeroElement(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0 || array[i] < 0) {
                return true;
            }
        }
        return false;
    }

    // array element having 1 non zero neighbour of non zero element

    public static boolean nonZeroHas1NonZeroNeighbour(int[] array , int i) {
        int count = 0;
        if (i == 0) {
            if (array[i + 1] != 0) {
                count++;
            }
        } else if (i == array.length - 1) {
            if (array[i - 1] != 0) {
                count++;
            }
        } else {
            if (array[i + 1] != 0) {
                count++;
            }
            if (array[i - 1] != 0) {
                count++;
            }
        }

        if (count == 1) {
            return true;
        }
        return false;
    }

    // array element of zero having 2 non zero neighbour

    public static boolean ZeroHas2NonZeroNeighbour(int[] array , int i) {
        if (i == 0 || i == array.length - 1) {
            return false;
        }
        if (array[i - 1] != 0 && array[i + 1] != 0) {
            return true;
        }
        return false;
    }
}
