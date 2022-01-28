package com.mumsquestion.page11;

/*
Write a function named isSquare that returns 1 if its integer argument is a square of some integer, otherwise it returns 0.
Your function must not use any function or method (e.g. sqrt) that comes with a runtime library or class library!

The signature of the function is
int isSquare(int n)

 */
public class IsSquare {
    public static void main(String[] args) {
        System.out.println(isSquare(4));
        System.out.println(isSquare(25));
        System.out.println(isSquare(-4));
        System.out.println(isSquare(8));
        System.out.println(isSquare(0));
    }

    public static int isSquare(int arg) {
        if (arg < 0) {
            return 0;
        }
        for (int i = 0; i * i <= arg; i++) {
            if (i * i == arg) {
                return 1;
            }
        }
        return 0;
    }
}
