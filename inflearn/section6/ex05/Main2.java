package com.company.inflearn.section6.ex05;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main2 {
    public String solution(int t, int[] arr) {
        String answer = "U";
        Map<Integer, Integer> map = new HashMap<>();
        for (int key : arr) {
            map.put(key, map.getOrDefault(key, 0) + 1);
        }
        for (int key : arr) {
            if (map.get(key) >= 2) {
                answer = "D";
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main2 T = new Main2();
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int[] arr = new int[t];
        for (int i = 0; i < t; i++) {
            arr[i] = in.nextInt();
        }
        System.out.print(T.solution(t, arr));
    }
}
