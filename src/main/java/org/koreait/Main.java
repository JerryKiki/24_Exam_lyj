package org.koreait;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //문제 1번
        System.out.println("==문제 1번 실행==");

        while (true) {
            try {
                System.out.print("가로길이, 세로길이를 공백을 사이에 두고 입력해주세요 : ");
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
    }
}