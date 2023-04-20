package Kopo_Algorithm;
import java.util.Scanner;

/*
 피보나치 수열
 
 입력예제 :
 10
 출력예제 :
 1 1 2 3 5 8 13 21 34 55
*/

public class Algorithm_0420 {
    public void solution(int n){
        int a = 1; 
        int b = 1;
        int c;
        System.out.print(a + " " + b + " ");
        for(int i = 2; i < n; i++){
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }
    public static void main(String[] args){
        Algorithm_0420 T = new Algorithm_0420();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        T.solution(n);
    }
}
