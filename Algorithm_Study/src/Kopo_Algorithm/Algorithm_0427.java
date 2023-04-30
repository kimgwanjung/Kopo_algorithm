package Kopo_Algorithm;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/*
 송아지 찾기(BFS : 상대트리 탐색)
입력예제 1:
 5 14
출력예제 1:
 3
입력예제 2 
 8 3
출력예제 2
 5

  */
public class Algorithm_0427 {
    int answer = 0;
    int[] dis = {1, -1, 5};
    int[] ch;
    Queue<Integer> Q = new LinkedList<>();
    
    
    public int BFS(int s, int e){
        ch = new int[10001];
        ch[s] = 1;
        /* 
         * offer() --> 해당 큐 맨 뒤에 값 삽입
         * 값 추가 성공시 true, 실패시 false
         * add()는 실패시 에러 발생
        */
        Q.offer(s);
        int L = 0;
        while(!Q.isEmpty()){
            int len = Q.size();
            for(int i = 0; i < len; i++){
                /*
                 * poll() --> offer로 넣고 poll로 뺀다고 보면 된다.
                 */
                int x = Q.poll();  // x = 5
                for(int j = 0; j < 3; j++){
                    int nx = x + dis[j];
                    if(nx == e){
                        return L + 1;
                    }
                    if(nx >= 1 && nx <= 10000 && ch[nx] == 0){
                        ch[nx] = 1;
                        Q.offer(nx);
                    }
                }
            }
            L++;
        }
        return 0;
    }

    public static void main(String[] args){
        Algorithm_0427 T = new Algorithm_0427();
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int e = sc.nextInt();
        System.out.println(T.BFS(s, e));
    }   

}
