package com.company.section7.ex03;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    int answer = 1;

    public int solution(int n) {
        if (n != 0) {
            solution(n - 1);
            answer *= n;
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(T.solution(n));
    }
}
