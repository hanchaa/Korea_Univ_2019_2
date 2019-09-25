package io.github.hanchaa;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int cnt, sum = 0, rand;

        Scanner sc = new Scanner(System.in);

        System.out.print("난수의 개수? ");
        cnt = sc.nextInt();

        for (int i = 1; i <= cnt; i++) {
            rand = (int) (Math.random() * 100);
            System.out.println("난수 : " + rand);
            sum += rand;
        }

        System.out.println("난수 " + cnt + "개의 합 = " + sum);
    }
}
