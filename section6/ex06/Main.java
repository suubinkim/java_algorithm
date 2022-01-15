package com.company.section6.ex06;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public ArrayList<Integer> solution(int t, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = 0; i < t - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                answer.add(i + 1);
                for (int j = i + 2; j < t - 1; j++) {
                    if (arr[j] < arr[j - 1]) answer.add(j + 1);
                }
                break;
            }
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
