package Kopo_Algorithm;
/* 
 * 문제 : 문자 찾기
 * 특정 문자를 입력받아 해당 특정문자가 입력받은 문자열에 몇 개 존재하는지
 * 알아내는 프로그램을 작성하세요. 대소문자를 구분하지 않습니다
 * 입력 예시 :
 * Computercooler
 * c
 * 출력 예시:
 * 2  
 * */
import java.util.*;
public class Alogrithm_0413{ 
    public int solution(String str, char t){
        int answer = 0;
        str = str.toUpperCase();
        t = Character.toUpperCase(t);
 
        for(char x : str.toCharArray()){
            if(x == t) {
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args){
        Alogrithm_0413 T = new Alogrithm_0413();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        char c = kb.next().charAt(0);
        System.out.print(T.solution(str, c));
    }
}