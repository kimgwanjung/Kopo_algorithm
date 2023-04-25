package Kopo_Algorithm;

import java.util.Scanner;

/*
 암호
#****## --> 'C'
#**#### --> 'O'
#**#### --> 'O'
#**##** --> 'L'
 입력예제:
4
#****###**#####**#####**##** 
 출력예제:
COOL
 */

public class Algorithm_0424 {
    public String solution(int input1, String input2) {
        String result = "";
        for(int i = 0; i < input1; i++){
            String tmp = input2.substring(0, 7).replace('#', '1').replace('*', '0');
            int num = Integer.parseInt(tmp, 2);
            result += (char)num;
            input2 = input2.substring(7);
        }
        return result;
    }
    public static void main(String[] args) {
        Algorithm_0424 T = new Algorithm_0424();
        Scanner sc = new Scanner(System.in);
        int input1 = sc.nextInt();
        String input2 = sc.next();
        System.out.println(T.solution(input1, input2));
    }
}
