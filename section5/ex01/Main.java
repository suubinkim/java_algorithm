package com.company.section5.ex01;

import java.util.*;

public class Main {

    public String solution(String t ) {
        String answer = "YES";
        Stack<Character> stack = new Stack<>();
        for(char x : t.toCharArray()){
            if( x == '('){
                stack.push(x);
            }else{
                if(stack.isEmpty()){
                    answer="NO";
                }else{
                    stack.pop();
                }
            }
        }
        if(!stack.isEmpty())answer="NO";

        return answer;
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        String t = in.next();
        System.out.print(T.solution(t));
    }
}
