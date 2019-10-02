package io.github.hanchaa;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] num = new int[5];
        double sum = 0;

        System.out.print(num.length + "개의 정수 입력: ");

        for(int i = 0; i < num.length; i++)
            num[i] = sc.nextInt();

        for(int k : num)
            sum += k;

        System.out.println("평균 : " + sum / 5);

        sc.close();
    }
}
