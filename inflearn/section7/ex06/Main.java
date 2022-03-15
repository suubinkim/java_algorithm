package com.company.inflearn.section7.ex06;

public class Main {
    static int n;
    static int[] ch;

    public void DFS(int L) {
        if (L == n + 1) {
            //1로 되어있는 인덱스 번호를 출력 ( 부분집합 출력 )
            String tmp = "";
            for (int i = 1; i <= n; i++) {
                if (ch[i] == 1) tmp += (i + " ");
            }
            if (tmp.length() > 0) System.out.println(tmp);
        } else {
            ch[L] = 1;//사용함
            DFS(L + 1);//왼쪽자식(사용o)

            ch[L] = 0;//사용 x
            DFS(L + 1);//오른쪽자식(사용x)
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        n = 3;
        ch = new int[n + 1];
        T.DFS(1);
    }
}
