package com.company.programmers.Lv1.완주하지못한선수;

import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {

        Map<String, Integer> map = new HashMap<>();
        for (String parti : participant) {
            map.put(parti, map.getOrDefault(parti, 0) + 1);
        }
        for (String com : completion) {
            map.replace(com, map.get(com) - 1);
        }
        return getKey(map, 1);
    }

    public static <K, V> K getKey(Map<K, V> map, V value) {

        for (K key : map.keySet()) {
            if (value.equals(map.get(key))) {
                return key;
            }
        }
        return null;
    }
}