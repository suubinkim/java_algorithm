package com.company.section6.ex01;

import java.util.Scanner;

public class Main {
    public int[] solution(int n, int[] arr) {
        int[] answer = new int[n];
        int min;
        int temp;
        for (int i = 0; i < arr.length; i++) {
            min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            answer[i] = arr[min];
            temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        for (int x : T.solution(n, arr)) {
            System.out.print(x + " ");
        }

    }
}
