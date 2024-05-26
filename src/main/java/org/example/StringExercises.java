package org.example;

public class StringExercises {


    public String notReplace(String str) {
        if (str.isEmpty()) return "";

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (i + 1 < str.length() && str.startsWith("is", i)) {
                boolean beforeIsLetter = i - 1 >= 0 && Character.isLetter(str.charAt(i - 1));
                boolean afterIsLetter = i + 2 < str.length() && Character.isLetter(str.charAt(i + 2));

                if (!beforeIsLetter && !afterIsLetter) {
                    result.append("is not");
                    i += 1; // Skip to the character after "is"
                } else {
                    result.append(str.charAt(i));
                }
            } else {
                result.append(str.charAt(i));
            }
        }
        return result.toString();
    }

    public int sumNumbers(String str) {
        if (str.isEmpty()) return 0;

        int sum = 0;
        StringBuilder numberContainer = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {

            if (Character.isDigit(str.charAt(i))) {
                numberContainer.append(str.charAt(i));

                if (i + 1 >= str.length() || !Character.isDigit(str.charAt(i + 1))) {
                    sum += Integer.parseInt(numberContainer.toString());
                    numberContainer.setLength(0);
                }
            }
        }
        return sum;
    }


    public int maxBlock(String str) {
        if (str.isEmpty()) return 0;

        int counter = 0;
        int currentMax = 0;
        for (int i = 0; i < str.length(); i++) {

            counter++;
            if (i + 1 < str.length() && str.charAt(i) == str.charAt(i + 1)) { //if next character exists and it is the same as the current one, continue the loop
                continue;
            } else {       //next character doesn't exist/is different,compares values of counter and currentMax variables, and zeroes the counter
                currentMax = Math.max(currentMax, counter);
                counter = 0;
            }
        }
        return currentMax;
    }

    public String mirrorEnds(String string) {
        int len = string.length();
        int i = 0;

        while (i < len && string.charAt(i) == string.charAt(len - 1 - i)) {
            i++;
        }

        return string.substring(0, i);
    }

    public String sameEnds(String str) {
        int len = str.length();
        for (int i = len / 2; i > 0; i--) {
            if (str.substring(0, i).equals(str.substring(len - i))) {
                return str.substring(0, i);
            }
        }
        return "";
    }

    public int sumDigits(String str) {
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                sum += Integer.parseInt(str.substring(i, i + 1));
            }
        }

        return sum;
    }

    public int countTriple(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if ((i - 1 >= 0 && str.charAt(i - 1) == str.charAt(i))
                    && (i + 1 < str.length() && str.charAt(i + 1) == str.charAt(i))) {
                count++;
            }
        }
        return count;
    }

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
