package io.github.hanchaa;

import java.util.Scanner;

public class Main {

    static void prn(int i, int j) throws Exception {
        if (j == 0)
            throw new RuntimeException("0으로 나누기 오류 발생");
        System.out.println(i / j);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("첫 번째 수: ");
        int i = sc.nextInt();
        System.out.print("두 번째 수: ");
        int j = sc.nextInt();

        try {
            prn(i, j);
        } catch(Exception e){
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
