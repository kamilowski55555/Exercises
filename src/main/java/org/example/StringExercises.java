package org.example;

public class StringExercises {


    public boolean gHappy(String str) {

        for (int i = 0; i < str.length(); i++) {


            if (str.charAt(i) == 'g') {
                if ((i - 1 >= 0 && str.charAt(i - 1) == 'g')
                        || (i + 1 < str.length() && str.charAt(i + 1) == 'g')) {
                    continue;
                } else {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean equalIsNot(String str) {
        int countNot = 0;
        int countIs = 0;

        for (int i = 0; i < str.length(); i++) {

            if (str.startsWith("is", i)) {
                countIs++;
            }
            if (str.startsWith("not", i)) {
                countNot++;
            }
        }

        return countNot == countIs;

    }

    public String withoutString(String base, String remove) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < base.length(); ) {
            if (i + remove.length() <= base.length() && base.toLowerCase().startsWith(remove.toLowerCase(), i)) {

                i = i + remove.length();
            } else {
                result.append(base.charAt(i));
                i++;
            }
        }

        return result.toString();

    }
}
