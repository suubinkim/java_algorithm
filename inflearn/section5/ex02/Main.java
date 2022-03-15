package com.company.inflearn.section5.ex02;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public String solution(String t ) {
        String answer = "";
        Stack<Character> stack = new Stack<>();
        for(char x : t.toCharArray()){
            if(x == '(')stack.push(x);
            else if ( x == ')')stack.pop();
            if(x != ')')
                if(stack.isEmpty()) answer += x;
        }
        return answer;
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        String t = in.next();
        System.out.print(T.solution(t));
    }
}
