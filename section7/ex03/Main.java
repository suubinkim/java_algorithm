package com.company.section7.ex03;

import java.util.Scanner;

public class Main {

    public int solution(int n) {
        if (n == 1) return 1;
        else return n * solution(n - 1);
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(T.solution(n));
    }
}
