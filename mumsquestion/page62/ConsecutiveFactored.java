package com.mumsquestion.page62;

/*

A positive number n is consecutive-factored if and only if it has factors, i and j where i > 1, j > 1 and j = i + 1. Write a function named
isConsecutiveFactored that returns 1 if its argument is consecutive-factored, otherwise it returns 0.
the function signature is
int isConsecutiveFactored(int n)

 */

import java.util.ArrayList;
import java.util.List;

public class ConsecutiveFactored {
    public static void main(String[] args) {

        System.out.println(isConsecutiveFactored(24));
        System.out.println(isConsecutiveFactored(105));
        System.out.println(isConsecutiveFactored(90));
        System.out.println(isConsecutiveFactored(23));
        System.out.println(isConsecutiveFactored(15));
        System.out.println(isConsecutiveFactored(2));
        System.out.println(isConsecutiveFactored(0));
        System.out.println(isConsecutiveFactored(-12));
    }

    public static int isConsecutiveFactored(int n) {

        if (n <= 0) {
            return 0;
        }
        List<Integer> list = getFactorsOfNumber(n);
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i + 1) == list.get(i) + 1) {
                return 1;
            }
        }
        return 0;
    }

    private static List<Integer> getFactorsOfNumber(int n) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                list.add(i);
            }
        }
        return list;
    }
}

