package Kopo_Algorithm;

import java.util.Scanner;

/*
특정 문자 뒤집기(알파벳만 뒤집기)
  입력예제 
  a#b!GE*T@S
  출력예제
  S#T!EG*b@a
 * */
public class Algorithm_0416 {
    public String solution(String str) {
        String answer;
        char[] s = str.toCharArray();
        int lt = 0;
        int rt = str.length() -1 ;
        while(lt < rt) {
            if(!Character.isAlphabetic(s[lt])) {
                lt++;
            }else if(!Character.isAlphabetic(s[rt])) {
                rt--;
            }else {
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }
        }
        answer = String.valueOf(s);
        return answer;
    }
    public static void main(String[] args) {
        Algorithm_0416 T = new Algorithm_0416();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.solution(str));
    }
}
