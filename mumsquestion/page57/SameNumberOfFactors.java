package com.mumsquestion.page57;

/*

Write a function named sameNumberOfFactors that takes two integer arguments and returns 1 if they have the same number of factors. If either argument
is negative, return -1. Other-wise return 0.
int sameNumberOfFactors(int n1, int n2)

 */

public class SameNumberOfFactors {

    public static void main(String[] args) {
        System.out.println(sameNumberOfFactors(-6 , 21));
        System.out.println(sameNumberOfFactors(6 , 21));
        System.out.println(sameNumberOfFactors(8 , 12));
        System.out.println(sameNumberOfFactors(23 , 97));
        System.out.println(sameNumberOfFactors(0 , 1));
        System.out.println(sameNumberOfFactors(0 , 0));
        System.out.println(sameNumberOfFactors(9 , 9));
    }

    public static int sameNumberOfFactors(int argument1 , int argument2) {

        if (argument1 < 0 || argument2 < 0) {
            return -1;
        }
        if (argument1 == argument2) {
            return 1;
        }

        if (findFactors(argument1) == findFactors(argument2)) {
            return 1;
        }
        return 0;
    }

    private static int findFactors(int argument) {

        int countFactors = 0;
        for (int i = 1; i <= argument; i++) {
            if (argument % i == 0) {
                countFactors++;
            }
        }
        return countFactors;
    }
}
