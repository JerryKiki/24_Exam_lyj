package org.koreait;

//1. 가로길이, 세로길이를 입력받아 사각형 넓이 만큼 별을 찍어내는 프로그램을 구현합니다(30점)
//for문 혹은 while문 둘다 사용가능
//Scanner 활용
//중첩반복문을 활용

public class Question1 {
    static void solution(int width, int height) {
        for (int i = 0; i < height; i++) { //줄 수
            for (int j = 0; j < width; j++) { //별 수
                System.out.print("*");
            }
            System.out.println(); //줄바꿈
        }
    }
}
