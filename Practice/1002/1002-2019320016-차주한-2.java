package io.github.hanchaa;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int sum = 0;

        System.out.println("정수 5개 입력!");

        for (int i = 0; i < 5; i++) {
            int num = sc.nextInt();

            if(num < 0) continue;
            else sum+=num;
        }

        System.out.println("양수의 합 = " + sum);

        sc.close();
    }
}
