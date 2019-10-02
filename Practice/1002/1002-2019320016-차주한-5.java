package io.github.hanchaa;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("'exit'을 입력 시 종료");

        while(true){
            System.out.print(">> ");
            String s = sc.nextLine();

            if(s.equals("exit")) break;
        }

        System.out.println("종료합니다...");
        sc.close();
    }
}
