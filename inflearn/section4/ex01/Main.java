package com.company.inflearn.section4.ex01;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public char solution(int a, String arr) {
        char answer;
        int[] alpha = new int[5];
        for(int i=0;i<arr.length();i++){
            alpha[arr.charAt(i)-'A']++;
        }
        int max = alpha[0];
        for(int x : alpha){
            if(x > max) max=x;
        }
        List<Integer> intList = Arrays.stream(alpha).boxed().collect(Collectors.toList());
        int result = intList.indexOf(max)+65;
        answer = (char)result;
        return answer;
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        String arr = in.next();
        System.out.print(T.solution(a,arr));
    }
}
