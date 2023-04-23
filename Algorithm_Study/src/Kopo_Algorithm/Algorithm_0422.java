package Kopo_Algorithm;
import java.util.Scanner;

/*
 팰린드롬(거꾸로 읽어도 똑같은)
 입력예제 
: found7, time: study; Yduts; emit, 7Dnuof
 출력예제
: YES
 */
public class Algorithm_0422 {
    public String solution(String s){
        String answer = "NO";
        s = s.toUpperCase().replaceAll("[^A-Z]", "");
        String temp = new StringBuilder(s).reverse().toString();
        if(s.equals(temp)) {
            answer = "YES";
        }
        return answer;
    }

    public static void main(String[] args){
        Algorithm_0422 T = new Algorithm_0422();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.print(T.solution(str));
    }
}
