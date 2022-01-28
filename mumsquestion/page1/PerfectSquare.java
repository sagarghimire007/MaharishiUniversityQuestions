package com.mumsquestion.page1;

/*
Write a function named nextPerfectSquare that returns the fist perfect square that is greater than its integer
argument. A perfect square is an integer that is equal to some integer squared. For example 16 is a perfect square
because 16 = 4 * 4. However 15 is not a perfect square because there is no integer n such that 15 = n * n.

The signature of  the function is
            int isPerfectSquare(int n)
 */

public class PerfectSquare {
    public static void main(String[] args) {
        System.out.println(nextPerfectSquare(6));
        System.out.println(nextPerfectSquare(36));
        System.out.println(nextPerfectSquare(0));
        System.out.println(nextPerfectSquare(-5));

//        System.out.println(nextPerfectSquare(0));
    }

    public static int nextPerfectSquare(int num) {
        
        if (num < 0) {
            return 0;
        }
        if (num == 0) {
            return 1;
        }
        while (num < Integer.MAX_VALUE) {
            num++;
            for (int i = 1; i * i <= num; i++) {
                if (i * i == num) {
                    return num;
                }
            }
        }
        return 0;
    }
}
