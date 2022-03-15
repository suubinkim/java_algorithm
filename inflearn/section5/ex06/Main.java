package com.company.inflearn.section5.ex06;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public String solution(String a, String b) {
        String answer = "YES";
        Queue<Character> u = new LinkedList<>();
        for (char x : a.toCharArray()) u.offer(x);
        for (char x : b.toCharArray()) {
            if (u.contains(x)) {
                if (x != u.poll()) return "NO";
            }
        }
        if (!u.isEmpty()) return "NO";
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.print(T.solution(a, b));
    }
}
