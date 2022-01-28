package com.mumsquestion.page17;

/*
An array is called vanilla if all its elements are made up of the same digit. For example {1, 1, 11, 1111, 1111111} is a vanilla array because
all its elements use only the digit 1. However, the array {11, 101, 1111, 11111} is not a vanilla array because its elements use the digits 0 and 1.
Write a method called isVanilla that returns 1 if its argument is a vanilla array. Other-wise it returns 0.

If you are writing in Java or C#, the function signature is
   int isVanilla(int[ ] a)

 */
public class Vanilla {
    public static void main(String[] args) {
        System.out.println("1 : " + isVanilla(new int[]{ 1 , 1 , 11 , 1111 , 11111 }));
        System.out.println("2 : " + isVanilla(new int[]{ 1 , 1 , 10 , 1111 , 11111 }));
        System.out.println("3 : " + isVanilla(new int[]{ 9 , 999 , 9999 , -99999 }));
        System.out.println("4 : " + isVanilla(new int[]{ 9 , 101 , 9999 , -99999 }));
        System.out.println("5 : " + isVanilla(new int[]{ 1 }));
        System.out.println("6 : " + isVanilla(new int[]{}));
    }

    public static int isVanilla(int[] a) {

        if (a.length < 1) {
            return 1;
        }
        int checkElement = a[0] % 10;
        int element, nextElement = 0;

        for (int i = 0; i < a.length; i++) {
            element = (a[i] < 0) ? (a[i] * -1) : a[i]; // conditional expression
            while (element != 0) {
                nextElement = element % 10;
                element = element / 10;
                if (checkElement != nextElement) {
                    return 0;
                }
            }
        }
        return 1;
    }
}
