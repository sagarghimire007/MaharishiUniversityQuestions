package com.mumsquestion.page63;

public class TypeCount {
    public static void main(String[] args) {
        String s = "Give me 10 dollars";
        typeCounter(s);
    }

    public static void typeCounter(String s) {


        int countString = 0, countInteger = 0, countDouble = 0;
        String[] result = s.split(" ");
        for (String a : result) {
            if (a.matches("\\d+")) {
                countInteger++;
            } else if (a.matches("\\d*[.]\\d+")) {
                countDouble++;
            } else {
                if (isLowercase(a)) {
                    countString++;
                }
            }
        }

        System.out.println("String " + countString);
        System.out.println("Integer " + countInteger);
        System.out.println("Double " + countDouble);
    }

    private static boolean isLowercase(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (!Character.isLowerCase(s.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
