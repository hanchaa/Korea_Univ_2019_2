package io.github.hanchaa;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int month;

        Scanner sc = new Scanner(System.in);

        do{
            System.out.print("월 입력[1-12]: ");
            month = sc.nextInt();
        }while(month < 1 || month > 12);

        System.out.println("사용자 입력 : " + month + "월");

        sc.close();
    }
}
