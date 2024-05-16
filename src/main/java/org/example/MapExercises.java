package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class MapExercises {


    public String[] firstSwap(String[] strings) {
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < strings.length; i++) {
            if (strings[i].isEmpty()) continue;

            char firstChar = strings[i].charAt(0);

            if (map.containsKey(firstChar) && map.get(firstChar) == -1) {
                continue;

            } else if (map.containsKey(firstChar)) {
                int prevIndex = map.get(firstChar);
                // Swap the strings
                String temp = strings[i];
                strings[i] = strings[prevIndex];
                strings[prevIndex] = temp;
                // Remove the key to prevent further matches
                map.put(firstChar, -1);

            } else {
                // Store the index for this first character
                map.put(firstChar, i);
            }
        }

        return strings;
    }

    public static String[] allSwap(String[] strings) {
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < strings.length; i++) {
            if (strings[i].isEmpty()) continue;

            char firstChar = strings[i].charAt(0);

            if (map.containsKey(firstChar)) {
                int prevIndex = map.get(firstChar);
                // Swap the strings
                String temp = strings[i];
                strings[i] = strings[prevIndex];
                strings[prevIndex] = temp;
                // Remove the key to prevent further matches
                map.remove(firstChar);
            } else {
                // Store the index for this first character
                map.put(firstChar, i);
            }
        }

        return strings;
    }

    public Map<String, Boolean> wordMultiple(String[] strings) {

        Map<String, Boolean> map = new HashMap<>();

        for (String s : strings) {
            if (!map.containsKey(s)) {
                map.put(s, false);
            } else {
                map.put(s, true);
            }
        }

        return map;

    }

    public String wordAppend(String[] strings) {

        Map<String, Integer> map = new HashMap<>();
        StringBuilder result = new StringBuilder();

        for (String s : strings) {
            if (!map.containsKey(s)) {
                map.put(s, 0);
            }
            map.put(s, map.get(s) + 1);

            if (map.get(s) % 2 == 0) {
                result.append(s);
            }
        }

        return result.toString();

    }

    public Map<String, String> firstChar(String[] strings) {
        Map<String, String> map = new HashMap<>();

        for (String s : strings) {

            if (!map.containsKey(String.valueOf(s.charAt(0)))) {
                StringBuilder value = new StringBuilder();
                for (String k : strings) {
                    if (s.charAt(0) == k.charAt(0)) {
                        value.append(k);
                    }
                }
                map.put(String.valueOf(s.charAt(0)), value.toString());
            }

        }

        return map;
    }

    public Map<String, Integer> wordCount(String[] strings) {
        Map<String, Integer> map = new HashMap<>();

        for (String s : strings) {
            if (!map.containsKey(s)) {
                map.put(s, 0);
            }
            map.put(s, map.get(s) + 1);
        }

        return map;
    }

    public Map<String, String> pairs(String[] strings) {
        Map<String, String> map = new HashMap<>();

        for (String s : strings) {
            map.put(String.valueOf(s.charAt(0)), String.valueOf(s.charAt(s.length() - 1)));
        }

        return map;
    }

    public Map<String, Integer> wordLen(String[] strings) {
        Map<String, Integer> map = new HashMap<>();

        for (String s : strings) {
            map.put(s, s.length());
        }

        return map;

    }


    public Map<String, Integer> word0(String[] strings) {
        Map<String, Integer> map = new HashMap<>();

        for (String s : strings) {
            map.put(s, 0);
        }

        return map;
    }

    // easier exercises from below
    public Map<String, String> mapAB4(Map<String, String> map) {

        if (map.containsKey("a") && map.containsKey("b") && map.get("a").length() > map.get("b").length()) {
            map.put("c", map.get("a"));
        }
        if (map.containsKey("a") && map.containsKey("b") && map.get("a").length() < map.get("b").length()) {
            map.put("c", map.get("b"));
        }
        if (map.containsKey("a") && map.containsKey("b") && map.get("a").length() == map.get("b").length()) {
            map.put("a", "");
            map.put("b", "");
        }

        return map;

    }


    public static Map<String, String> mapAB3(Map<String, String> map) {
        boolean hasA = map.containsKey("a") && map.get("a") != null;
        boolean hasB = map.containsKey("b") && map.get("b") != null;

        if (hasA && !hasB) {
            map.put("b", map.get("a"));
        } else if (hasB && !hasA) {
            map.put("a", map.get("b"));
        } else if (hasA && hasB && map.get("a").isEmpty() && !map.get("b").isEmpty()) {
            map.put("a", map.get("b"));
        } else if (hasA && hasB && map.get("b").isEmpty() && !map.get("a").isEmpty()) {
            map.put("b", map.get("a"));
        }

        return map;
    }

    public Map<String, String> mapAB2(Map<String, String> map) {

        if (map.containsKey("a") && map.containsKey("b") && Objects.equals(map.get("a"), map.get("b"))) {
            map.remove("a");
            map.remove("b");
        }
        return map;
    }

    public Map<String, String> topping3(Map<String, String> map) {

        if (map.containsKey("potato")) {
            map.put("fries", map.get("potato"));
        }
        if (map.containsKey("salad")) {
            map.put("spinach", map.get("salad"));
        }

        return map;
    }


}
