package Kopo_Algorithm;

import java.util.Scanner;

/*
숫자만 추출
 입력예제
:g0en2T0s8eSoft
 출력예제
:208
 */
public class Algorithm_0423 {
    public int solution(String t) {
        String answer = "";
        for(char x : t.toCharArray()) {
            if(Character.isDigit(x)) {
                answer += x;
            }           
        }
        return Integer.parseInt(answer);
    }
    public static void main(String[] args) {
        Algorithm_0423 T = new Algorithm_0423();
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        System.out.println(T.solution(input));
    }
}
