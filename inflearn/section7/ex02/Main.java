package com.company.inflearn.section7.ex02;

import java.util.Scanner;

public class Main {
    public void binary(int n) {
        if (n == 0) return;
        else {
            binary(n / 2);
            System.out.print(n % 2);
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        T.binary(n);
    }
}
