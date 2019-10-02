package io.github.hanchaa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int Class, Student, cnt = 0;
        double sum = 0;

        System.out.print("반 수 입력: ");
        Class = sc.nextInt();

        System.out.print("반별 학생 수 입력: ");
        Student = sc.nextInt();

        int[][] score = new int[Class * Student][2];

        for (int i = 0; i < Class; i++) {
            for (int j = 0; j < Student; j++) {
                System.out.print("\n국어 점수 입력: ");
                score[cnt][0] = sc.nextInt();

                System.out.print("영어 점수 입력: ");
                score[cnt][1] = sc.nextInt();

                System.out.printf("합 = %d, 평균 = %.2f\n", score[cnt][0] + score[cnt][1], (double) (score[cnt][0] + score[cnt][1]) / 2);
                sum += score[cnt][0] + score[cnt][1];
                
                cnt++;
            }
        }

        System.out.printf("\n총합 = %.0f, 과목당평균 = %.2f\n", sum, sum / (2 * cnt));
        
        sc.close();
    }
}
