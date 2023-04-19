package Kopo_Algorithm;
import java.util.Scanner;
/*
입력 :
 첫 줄에 정수 입력,
 그 다음줄에 N명의 학생의 키가 앞에서부터 
 순서대로 주어진다.
출력 :
 선생님이 볼 수 있는 최대학생수를 출력한다.
 입력예제 
8
130 135 148 140 145 150 150 153 
 출력예제 
5
 */
public class Algorithm_0419 {
    public int solution(int n, int[] arr){
        int answer = 1 ;                
        int max = arr[0];
        for(int i = 1; i < n; i++){
            if(arr[i] > max){
                max = arr[i];
                answer++;
            }
        }
        return answer;
    }
    public static void main(String[] args){
        Algorithm_0419 T = new Algorithm_0419();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print(T.solution(n, arr));
    }
}
