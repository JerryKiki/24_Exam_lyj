package org.koreait;

import java.util.InputMismatchException;

// 양의 정수 n을 요청받아 숫자 패턴의 피라미드를 출력하는 프로그램을 구현합니다.
// 피라미드는 n 레벨을 가져야 하며, 최상위 레벨에서 n부터 시작하여 맨 아래층에서 1까지 숫자가 감소해야 합니다. (30점)
// for문 혹은 while문 둘다 사용가능
// Scanner 활용
// 중첩반복문을 활용
public class Question2 {
    static void Solution(int num) {

        if (num <= 0) throw new InputMismatchException();

        for (int i = 0; i < num; i++) { //줄 수
            for (int j = 0; j < i; j++) { //공백 출력
                System.out.print(" ");
            }
            for (int j = num - i; j > 0; j--) { //숫자 출력
                System.out.printf("%d ", j);
            }
            System.out.println();
        }
    }
}
