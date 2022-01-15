package com.company.section6.ex06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public ArrayList<Integer> solution(int t, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        int[] newArr = arr.clone();
        Arrays.sort(newArr);
        for (int i = 0; i < t; i++) {
            if (arr[i] != newArr[i]) answer.add(i + 1);
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int[] arr = new int[t];
        for (int i = 0; i < t; i++) {
            arr[i] = in.nextInt();
        }
        for (int x : T.solution(t, arr)) {
            System.out.print(x + " ");
        }
    }
}
