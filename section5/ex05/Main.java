package com.company.section5.ex05;

import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public Integer solution(int n, int k ) {
        Integer answer=0;
        Queue<Integer> queue = new LinkedList<>();
        for(int i=1;i<n+1;i++){
            queue.offer(i);
        }
        while (queue.size()>1){
            for(int i=0;i<k-1;i++){
                Integer a = queue.poll();
                queue.offer(a);
            }
            queue.poll();
        }
        answer = queue.poll();

        return answer;
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        System.out.print(T.solution(n,k));
    }
}
