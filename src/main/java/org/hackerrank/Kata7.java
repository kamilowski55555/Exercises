package org.hackerrank;

public class Kata7 {

    public static String maskify(String str) {
        StringBuilder result = new StringBuilder();
        if (str.length()<5) {
            return str;
        }
        for (int i = 0; i< str.length()-4; i++) {
            result.append('#');
        }
        result.append(str.substring(str.length()-4));

        return  result.toString();
    }
}
