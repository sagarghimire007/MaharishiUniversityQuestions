package com.mumsquestion.page45;

import java.util.ArrayList;
import java.util.List;

public class MercurialArray {
    public static void main(String args[]) {
//
        System.out.println(isMercurial(new int[]{ 1 , 2 , 10 , 3 , 15 , 1 , 2 , 2 }));
        System.out.println(isMercurial(new int[]{ 5 , 2 , 10 , 3 , 15 , 1 , 2 , 2 }));
        System.out.println(isMercurial(new int[]{ 1 , 2 , 10 , 3 , 15 , 16 , 2 , 2 }));
        System.out.println(isMercurial(new int[]{ 3 , 2 , 18 , 1 , 0 , 3 , -11 , 1 , 3 }));
        System.out.println(isMercurial(new int[]{ 2 , 3 , 1 , 1 , 18 }));
        System.out.println(isMercurial(new int[]{ 8 , 2 , 1 , 1 , 18 , 3 , 5 }));
        System.out.println(isMercurial(new int[]{ 3 , 3 , 3 , 3 , 3 , 3 }));
        System.out.println(isMercurial(new int[]{ 1 }));
        System.out.println(isMercurial(new int[]{}));
    }

    private static int isMercurial(int[] num) {

        List<Integer> list = new ArrayList<Integer>();
        boolean oneBefore3 = false;
        boolean oneAfter3 = false;
        for (int i = 0; i < num.length; i++) {
            if (num[i] == 3) {
                list.add(i);
            }
        }

        for (int p = 0; p < list.size(); p++) {
            for (int i = 0; i < list.get(p); i++) {
                if (num[i] == 1) {
                    oneBefore3 = true;
                }
            }
            for (int i = list.get(p); i < num.length; i++) {
                if (num[i] == 1) {
                    oneAfter3 = true;
                }
            }
            if (oneAfter3 && oneBefore3) {
                return 0;
            }
        }
        return 1;
    }
}
