package org.example;

import java.util.Map;
import java.util.Objects;

public class MapExercises {

    public Map<String, String> mapAB4(Map<String, String> map) {

        if ( map.containsKey("a") && map.containsKey("b") && map.get("a").length() > map.get("b").length()) {
            map.put("c", map.get("a"));
        }
        if ( map.containsKey("a") && map.containsKey("b") && map.get("a").length() < map.get("b").length()) {
            map.put("c", map.get("b"));
        }
        if ( map.containsKey("a") && map.containsKey("b") && map.get("a").length() == map.get("b").length()) {
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

        if ( map.containsKey("a") && map.containsKey("b") && Objects.equals(map.get("a"), map.get("b"))) {
            map.remove("a");
            map.remove("b");
        }
        return map;
    }

    public Map<String, String> topping3(Map<String, String> map) {

        if (map.containsKey("potato")) {
            map.put("fries",map.get("potato"));
        }
        if (map.containsKey("salad")) {
            map.put("spinach",map.get("salad"));
        }

        return map;
    }


}
