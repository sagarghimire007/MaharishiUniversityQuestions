package com.mumsquestion.page42;

import java.util.ArrayList;
import java.util.List;

public class Anagram {
    public static void main(String[] args) {
        System.out.println(areAnagram(new char[]{ 's' , 'i' , 't' } , new char[]{ 'i' , 's' , 't' }));
        System.out.println(areAnagram(new char[]{ 'p' , 'o' , 'o' , 'l' } , new char[]{ 'p' , 'o' , 'l' , 'l' }));
        System.out.println(areAnagram(new char[]{ 'b' , 'i' , 'g' } , new char[]{ 'b' , 'i' , 't' }));
        System.out.println(areAnagram(new char[]{ 'b' , 'o' , 'g' } , new char[]{ 'b' , 'i' , 'o' }));
        System.out.println(areAnagram(new char[]{} , new char[]{}));
        System.out.println(areAnagram(new char[]{ 'b' , 'i' , 'g' } , new char[]{ 'b' , 'i' , 'g' }));

    }

    private static int areAnagram(char[] c1 , char[] c2) {
        int isMatched = 1;
        List<Character> list1 = new ArrayList<Character>();
        List<Character> list2 = new ArrayList<Character>();
        if (c1.length != c2.length) {
            return 0;
        }

        for (int i = 0; i < c1.length; i++) {
            list1.add(c1[i]);
            list2.add(c2[i]);
        }

        for (int i = 0; i < list1.size(); ) {
            for (int j = 0; j < list2.size(); j++) {
                if (!list1.get(i).equals(list2.get(j))) {
                    isMatched = 0;
                    continue;
                } else {
                    list1.remove(i);
                    list2.remove(j);
                    i = 0;
                    j = 0;
                    isMatched = 1;
                    break;
                }
            }
            if (isMatched == 0) {
                return 0;
            }
        }
        return isMatched;
    }
}
