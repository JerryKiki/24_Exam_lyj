package org.koreait;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //문제 1번
        System.out.println("==문제 1번 실행==");
        System.out.println("입력하신 가로길이, 세로길이에 따라 사각형 모양으로 별을 찍습니다.");

        while (true) {
            try {
                System.out.print("가로길이, 세로길이를 공백 혹은 엔터로 구분하여 입력해주세요 : ");
                int q1Width = sc.nextInt();
                int q1Height = sc.nextInt();
                Question1.solution(q1Width, q1Height);
                sc.nextLine();
                break;
            } catch (InputMismatchException e) {
                System.out.println("올바른 입력값이 아닙니다.");
                sc.nextLine();
            }
        }

        //문제 2번
        System.out.println();
        System.out.println("==문제 2번 실행==");
        System.out.println("입력하신 양의 정수값에 따라 숫자 패턴의 피라미드를 출력합니다.");
        while (true) {
            try {
                System.out.print("양의 정수를 입력해주세요 : ");
                int num = sc.nextInt();
                Question2.Solution(num);
                sc.nextLine();
                break;
            } catch (InputMismatchException e) {
                System.out.println("올바른 입력값이 아닙니다.");
                sc.nextLine();
            }
        }

        //문제 3번
        System.out.println();
        System.out.println("==문제 3번 실행==");
        System.out.println("정수 10개의 피보나치 수열 숫자를 출력합니다.");
        Question3.solution();

        System.out.println();
        System.out.println("==실행을 종료합니다==");

        sc.close();
    }
}