package com.mumsquestion.page45;

/*

A number n is triangular if n == 1 + 2 +...+j for some j. Write a function
int isTriangular(int n)
that returns 1 if n is a triangular number, otherwise it returns 0. The first 4 triangular numbers are 1 (j=1), 3 (j=2), 6, (j=3), 10 (j=4).

 */

public class IsTriangular {

    public static void main(String[] args) {

        System.out.println(isTriangular(3));
        System.out.println(isTriangular(6));
        System.out.println(isTriangular(10));
        System.out.println(isTriangular(5));
    }

    public static int isTriangular(int n) {

        if (n < 1) {
            return 0;
        }
        int sum = 0;
        for (int i = 1; i < n; i++) {
            sum += i;
            if (sum == n) {
                return 1;
            }
            if (sum > n) {
                return 0;
            }
        }
        return 0;
    }
}
