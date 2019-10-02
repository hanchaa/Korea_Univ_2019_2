package io.github.hanchaa;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] num = new int[5];
        int max = 0;

        System.out.print("양수 5개 입력: ");

        for(int i = 0; i < 5; i++){
            num[i] = sc.nextInt();

            System.out.print(num[i] + " ");

            if(num[i] > max) max = num[i];
        }

        System.out.println("\n가장 큰 수 : " + max);

        sc.close();
    }
}
