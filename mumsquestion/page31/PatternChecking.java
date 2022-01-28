package com.mumsquestion.page31;

public class PatternChecking {
    public static void main(String[] args) {

        int[] a = { 1 , 1 , 2 , 2 , 2 , 3 };
        int[] pattern = { 1 , 3 };
        int len = a.length;
        int patternLen = pattern.length;
        System.out.println(matchPattern(a , len , pattern , patternLen));
    }

    public static int matchPattern(int[] a , int len , int[] pattern , int patternLen) {
        int i = 0;
        int k = 0;
        int matches = 0;
        for (i = 0; i < len; i++) {
            if (a[i] == pattern[k]) {
                matches++;
            } else if (matches == 0 || k == patternLen - 1) {
                return 0;
            } else {
                if (a[0] != pattern[0] || (a[len - 1] != pattern[patternLen - 1])) {
                    return 0;
                }
                k++;
                if (a[i] == pattern[k]) {
                    matches++;
                    continue;
                } else {
                    return 0;
                }
            }
        }
        if (i == len && k == patternLen - 1) {
            return 1;
        } else {
            return 0;
        }
    }
}
