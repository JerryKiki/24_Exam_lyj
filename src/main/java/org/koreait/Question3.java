package org.koreait;

//3. 프로그램은 정수 10개의 피보나치 수열 숫자를 출력합니다. 수열을 생성하기 위해 루프를 사용합니다. (40점)
//- for문 혹은 while문 둘다 사용가능
//- 중첩반복문을 활용
public class Question3 {
    static void solution() {
        int[] answer = new int[10];
        for (int i = 0; i < 10; i++) {
            if (i < 2) answer[i] = i;
            else answer[i] = answer[i - 2] + answer[i - 1];
            System.out.printf("%d ", answer[i]);
        }
        System.out.println();
    }
}
