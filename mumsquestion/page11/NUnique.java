package com.mumsquestion.page11;

/*
An array is defined to be n-unique if exactly one pair of its elements sum to n. For example, the array {2, 7,  3, 4} is 5-unique
because only a[0] and a[2] sum to 5. But the array {2, 3, 3, 7} is not 5-unique because a[0] + a[1] = 5 and a[0] + a[2] = 5.

Write a function named isNUnique that returns 1 if its integer array argument is n-unique, otherwise it returns 0. So
isNUnique(new int[ ]{2, 7, 3, 4}, 5) should return 1 and isNUnique(new int[] {2, 3, 3, 7}, 5) should return 0.

If you are programming in Java or C#, the function signature is
    int isNUnique(int[ ] a, int n)

If you are programming in C or C++, the function signature is
    int isNUnique(int a[ ], int len, int n) where len is the number of elements in the array.

 */
public class NUnique {
    public static void main(String[] args) {

        System.out.println("Result 1 : " + isNUnique(new int[]{ 7 , 3 , 3 , 2 , 4 } , 6));
        System.out.println("Result 2 : " + isNUnique(new int[]{ 7 , 3 , 3 , 2 , 4 } , 10));
        System.out.println("Result 3 : " + isNUnique(new int[]{ 7 , 3 , 3 , 2 , 4 } , 11));
        System.out.println("Result 4 : " + isNUnique(new int[]{ 7 , 3 , 3 , 2 , 4 } , 8));
        System.out.println("Result 5 : " + isNUnique(new int[]{ 7 , 3 , 3 , 2 , 4 } , 4));
        System.out.println("Result 6 : " + isNUnique(new int[]{ 0 , 5 } , 5));
        System.out.println("Result 7 : " + isNUnique(new int[]{ 1 } , 6));
        System.out.println("Result 8 : " + isNUnique(new int[]{ -5 , 10 } , 5));
    }

    public static int isNUnique(int[] a , int number) {
        int countUniqueNumber = 0;
        if (a.length <= 1) {
            return 0;
        }
        for (int i = 0; i < a.length - 1; i++) {
            int uniqueSum = 0;
            for (int j = i + 1; j < a.length; j++) {
                uniqueSum = a[i] + a[j];
                if (uniqueSum == number) {
                    countUniqueNumber++;
                }
            }
        }
        if (countUniqueNumber == 1) {
            return 1;
        }
        return 0;
    }
}
