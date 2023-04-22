package Kopo_Algorithm;

import java.util.Scanner;

/*
 봉우리(Array)
 - 자신의 상하좌우 숫자보다 큰 숫자가 봉우리
   봉우리가 몇개인지
입력예제
5
5 3 7 2 3
3 7 1 6 1
7 2 5 3 4
4 3 6 4 1
8 7 3 5 2
 출력예제
10
 */
public class Algorithm_0421 {
    
    int[] dx = {-1, 0, 1, 0};
    int[] dy = {0, 1, 0, -1};
    
    public int solution(int n, int[][] arr){
        int answer = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                boolean check = true;
                for(int k = 0; k < 4; k++){
                    int nx = i + dx[k];
                    int ny = j + dy[k];
                    if(nx >= 0 && nx < n && ny >= 0 && ny < n && arr[nx][ny] >= arr[i][j]){
                        check = false;
                        break;
                    }
                }
                if(check) {
                    answer++;
                }
            }
        }
        return answer;
    }
    public static void main(String[] args){
        Algorithm_0421 T = new Algorithm_0421();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr= new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.print(T.solution(n, arr));
    }
}
