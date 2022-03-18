package com.company.programmers.Lv1.숫자문자열과영단어;

import java.util.Arrays;
import java.util.List;

class Solution {
    public int solution(String s) {
        List<String> num = Arrays.asList("zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine");
        for (int i = 0; i < num.size(); i++) {
            s = s.replaceAll(num.get(i), Integer.toString(i));
        }
        return Integer.parseInt(s);
    }
}

