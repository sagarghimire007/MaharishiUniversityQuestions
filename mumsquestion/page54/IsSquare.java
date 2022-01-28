package com.mumsquestion.page54;

/*
Write a function named isSquare that returns 1 if its integer argument is a square of some integer, otherwise it returns 0. Your function must not
use any function or method (e.g. sqrt) that comes with a runtime library or class library!  You will need to write a loop to solve this problem.
Furthermore, your method should return as soon as the status of its parameter is known. So once it is known that the input parameter is a square of
some integer, your method should return 1 and once it is known that the input is not a square, the method should return 0. There should be no
wasted loop cycles, your method should be efficient !
 */

public class IsSquare {
    public static void main(String[] args) {

        System.out.println(isSquare(4));
        System.out.println(isSquare(25));
        System.out.println(isSquare(-4));
        System.out.println(isSquare(8));
        System.out.println(isSquare(0));
    }

    public static int isSquare(int n) {

        if (n < 0) {
            return 0;
        }
        for (int i = 0; i * i <= n; i++) {
            if (i * i == n) {
                return 1;
            }
        }
        return 0;
    }
}
