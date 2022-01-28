package com.mumsquestion.page29;

/*

Define an m-n sequenced array to be an array that contains one or more occurrences of all the integers between m and n inclusive.
Furthermore, the array must be in ascending order and contain only those integers. For example, {2, 2, 3, 4, 4, 4, 5} is a 2-5 sequenced array.
The array {2, 2, 3, 5, 5, 5} is not a 2-5 sequenced array because it is missing a 4. The array {0, 2, 2, 3, 3} is not a 2-3 sequenced array because
the 0 is out of range. And {1,1, 3, 2, 2, 4} is not a 1-4 sequenced array because it is not in ascending order.

Write a method named isSequencedArray that returns 1 if its argument is a m-n sequenced array, otherwise it returns 0.

If you are writing in Java or C# the function signature is
int isSequencedArray(int[ ] a, int m, int n)

 */

public class SequencedArray {
    public static void main(String[] args) {

        System.out.println(isSequencedArray(new int[]{ 1 , 2 , 3 , 4 , 5 } , 1 , 5));
        System.out.println(isSequencedArray(new int[]{ 1 , 2 , 3 , 2 , 5 } , 1 , 5));
        System.out.println(isSequencedArray(new int[]{ -5 , -5 , -4 , -4 , -4 , -3 , -3 , -2 , -2 , -2 } , -5 , -2));
        System.out.println(isSequencedArray(new int[]{ 0 , 1 , 2 , 3 , 4 , 5 } , 1 , 5));
        System.out.println(isSequencedArray(new int[]{ 1 , 2 , 3 , 4 } , 1 , 5));
        System.out.println(isSequencedArray(new int[]{ 1 , 2 , 5 } , 1 , 5));
        System.out.println(isSequencedArray(new int[]{ 5 , 4 , 3 , 2 , 1 } , 1 , 5));
        System.out.println(isSequencedArray(new int[]{ 0 , 0 , 0 , 0 , 0 , 0 } , 0 , 0));
    }

    public static int isSequencedArray(int[] a , int m , int n) {

        if ((a[0] != m) || (a[a.length - 1] != n)) {
            return 0;
        }
        if (areElementsAscendingOrder(a , m)) {
            return 1;
        }
        return 0;
    }

    public static boolean areElementsAscendingOrder(int[] a , int m) {

        int element = m;
        for (int i = 1; i < a.length; i++) {
            if (a[i] == element) {
                continue;
            }
            if (a[i] != element) {
                if ((a[i] != element + 1)) {
                    return false;
                }
                element = a[i];
            }
        }
        return true;
    }
}
