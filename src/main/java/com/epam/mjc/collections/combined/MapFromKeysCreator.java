package com.epam.mjc.collections.combined;

import java.util.*;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
        Map<Integer, Set<String>> finalMap = new HashMap<>();

        List<String> strings = new ArrayList<>(sourceMap.keySet());

        for (String s : strings) {
            int key = s.length();

            if (!finalMap.containsKey(key)) {
                finalMap.put(key, new HashSet<>());
            }

            finalMap.get(key).add(s);
        }

        return finalMap;
    }
}
