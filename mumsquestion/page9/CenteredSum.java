package com.mumsquestion.page9;

public class CenteredSum {
    public static void main(String[] args) {

        System.out.println("Result 1 : " + isCentered15(new int[]{ 3 , 2 , 10 , 4 , 1 , 6 , 9 }));
        System.out.println("Result 2 : " + isCentered15(new int[]{ 2 , 10 , 4 , 1 , 6 , 9 }));
        System.out.println("Result 3 : " + isCentered15(new int[]{ 3 , 2 , 10 , 4 , 1 , 6 }));
        System.out.println("Result 4 : " + isCentered15(new int[]{ 1 , 1 , 8 , 3 , 1 , 1 }));
        System.out.println("Result 5 : " + isCentered15(new int[]{ 9 , 15 , 6 }));
        System.out.println("Result 6 : " + isCentered15(new int[]{ 1 , 1 , 2 , 2 , 1 , 1 }));
        System.out.println("Result 7 : " + isCentered15(new int[]{ 1 , 1 , 15 , -1 , -1 }));
        System.out.println("Result 8 : " + isCentered15(new int[]{ 15 })); // returns 1 ... because the number itself is 15 and no any number
        // preceding and followed
        System.out.println("Result 9 : " + isCentered15(new int[]{}));
    }

    public static int isCentered15(int[] a) {

        if (a.length < 1) {
            return 0;
        }
        for (int i = 0; i < a.length; i++) {
            int sum = 0;
            for (int j = i; j < a.length; j++) {
                sum += a[j];
                if (sum > 15) {
                    break;
                }
                if (sum == 15 && (i == (a.length - 1) - j)) {
                    return 1;
                }
            }
        }
        return 0;
    }
}
