package io.github.hanchaa;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0, cnt = 0;

        System.out.println("정수 3개를 입력하세요");

        while(cnt < 3){
            int num;
            try{
                num = sc.nextInt();
            }
            catch(InputMismatchException e){
                System.out.println("정수 아님! 다시 입력하세요!");
                sc.next();
                continue;
            }
            sum += num;
            cnt++;
        }

        System.out.println("합 = " + sum);
    }
}
