package week02.collection;

import java.util.HashMap;
import java.util.Map;

public class Col6 {
    public static void main(String[] args) {
        //HashMap, TreeMap
        Map<String, Integer> intMap = new HashMap<>();

        intMap.put("일", 11);
        intMap.put("이", 12);
        intMap.put("삼", 13);
        intMap.put("삼", 14);
        intMap.put("삼", 15);
        intMap.put("삼", 16);

        for (String key : intMap.keySet()) {
            System.out.println(key);
        }

        for (Integer value : intMap.values()) {
            System.out.println(value);
        }

        System.out.println(intMap.get("삼"));


    }
}
