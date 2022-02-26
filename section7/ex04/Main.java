package com.company.section7.ex04;

import java.util.Scanner;

public class Main {
    public int solution(int n) {
        if(n==1) return 1;
        else if(n==2) return 1;
        else return solution(n-2) + solution(n-1);
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print(T.solution(i) + " ");
        }

    }
}
