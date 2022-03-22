package com.company.programmers.Lv1.모의고사;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> solution(int[] answers) {
        List<Integer> answer = new ArrayList<>();
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] c = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int numA = 0, numB = 0, numC = 0;

        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == a[i % 5]) numA++;
            if (answers[i] == b[i % 8]) numB++;
            if (answers[i] == c[i % 10]) numC++;
        }
        int max = Math.max(Math.max(numA, numB), numC);
        if (numA == max) answer.add(1);
        if (numB == max) answer.add(2);
        if (numC == max) answer.add(3);
        return answer;
    }
}
