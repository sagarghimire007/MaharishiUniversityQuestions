package com.mumsquestion.page17;

/*
Define an array to be trivalent if all its elements are one of three different values. For example, {22, 19, 10, 10, 19, 22, 22, 10} is
trivalent because all elements are either 10, 22, or 19. However, the array {1, 2, 2, 2, 2, 2, 2} is not trivalent because it contains only two
different values (1, 2). The array {2, 2, 3, 3, 3, 3, 2, 41, 65} is not trivalent because it contains four different values (2, 3, 41, 65).

Write a function named isTrivalent that returns 1 if its array argument is trivalent, otherwise it returns 0.

If you are writing in Java or C#, the function signature is
   int isTrivalent (int[ ] a)

 */

import java.util.ArrayList;
import java.util.List;

public class Trivalent {
    public static void main(String[] args) {
        System.out.println("Result 1 : " + isTrivalent(new int[]{ 22 , 19 , 10 , 10 , 11 , 19 , 22 , 22 , 10 , 10 }));
        System.out.println("Result 2 : " + isTrivalent(new int[]{ 22 , 19 , 10 , 10 , 19 , 22 , 10 , 10 }));
        System.out.println("Result 3 : " + isTrivalent(new int[]{ -1 , 0 , 1 , 0 , 0 , 0 }));
        System.out.println("Result 4 : " + isTrivalent(new int[]{}));
        System.out.println("Result 5 : " + isTrivalent(new int[]{ 2147483647 , -1 , -1 , -2147483647 })); // contains exact 3 different element
        System.out.println("Result 6 : " + isTrivalent(new int[]{ 1 , 1 , 1 , 2 , 2 , 2 , 2 , 2 , 2 , 2 })); // contains only two different element
    }

    public static int isTrivalent(int[] a) {

        if (a.length < 1) {
            return 0;
        }
        List<Integer> list = new ArrayList<Integer>();
        int trivalentNumberCount = 0;
        for (int i = 0; i < a.length; i++) {
            if (list.size() == 0) {
                list.add(a[i]);
                trivalentNumberCount++;
            } else {
                if (isNextElementTrivalent(list , a[i])) {
                    list.add(a[i]);
                    trivalentNumberCount++;
                    if (trivalentNumberCount > 3) { // if the different element exceeds more than 3 at early.... than no need for further loop...
                        return 0;
                    }
                }
            }
        }
        if (trivalentNumberCount == 3) {
            return 1;
        }
        return 0;
    }

    public static boolean isNextElementTrivalent(List<Integer> list , int num) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == num) {
                return false;
            }
        }
        return true;
    }
}
