package Kopo_Algorithm;

import java.util.Scanner;

/* 멘토링

   입력예제
   4 3
   3 4 1 2
   4 3 2 1
   3 1 4 2
   출력예제
   3
*/
public class Algorithm_0417 {
    public int solution(int n, int m, int[][] arr){
        int answer=0;
        
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                int cnt = 0;
                for(int k = 0; k < m; k++){
                    int pi = 0, pj = 0;
                    for(int s = 0; s < n; s++){
                        if(arr[k][s] == i) pi = s;
                        if(arr[k][s] == j) pj = s;
                    }
                    if(pi < pj) {
                        cnt++;
                    }
                }
                if(cnt == m){
                    answer++;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args){
        Algorithm_0417 T = new Algorithm_0417();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int m=kb.nextInt();
        
        int[][] arr=new int[m][n];
        
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                arr[i][j] = kb.nextInt();
            }
        }
        System.out.print(T.solution(n, m, arr));
    }
}
