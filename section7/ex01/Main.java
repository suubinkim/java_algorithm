package com.company.section7.ex01;

public class Main {
    public void DFS(int n) {
        if (n == 0) return;
        else {
            DFS(n - 1);
            System.out.print(n + " ");
        }
    }

    public boolean solution(int n) {
        DFS(n);
        return false;
    }

    public static void main(String[] args) {
        Main T = new Main();
        T.solution(3);
        System.out.println(T.solution(3));
    }
}
