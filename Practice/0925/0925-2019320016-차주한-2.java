package io.github.hanchaa;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        int num;

        Scanner sc = new Scanner(System.in);

        System.out.print("수 입력 : ");
        num = sc.nextInt();

        if(num % 3 == 0)
            System.out.println("3의 배수입니다.");

        else if(num % 3 != 0)
            System.out.println("3의 배수가 아닙니다.");

        sc.close();
    }
}
