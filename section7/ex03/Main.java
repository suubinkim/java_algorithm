package com.company.section7.ex03;

import java.util.Scanner;

public class Main {
    public int solution(int n) {
        int answer = 1;
        for (int i = n; i > 0; i--) {
            answer *= i;
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.print(T.solution(n));
    }
}
