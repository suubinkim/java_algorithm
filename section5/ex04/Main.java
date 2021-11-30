package com.company.section5.ex04;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public int solution(String t ) {
        int answer=0;
        Stack<Integer> stack = new Stack<>();
        for(char x : t.toCharArray()){
            if(Character.isDigit(x))stack.push(x-48);
            else {
                int rt = stack.pop();
                int lt = stack.pop();
                if(x=='+')stack.push(lt+rt);
                else if (x=='-')stack.push(lt-rt);
                else if (x=='*')stack.push(lt*rt);
                else if (x=='/')stack.push(lt/rt);
            }
        }
        answer = stack.pop();


        return answer;
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        String t = in.next();
        System.out.print(T.solution(t));
    }
}
