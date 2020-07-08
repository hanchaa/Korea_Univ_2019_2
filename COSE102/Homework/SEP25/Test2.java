package Homework.SEP25;

import java.util.Scanner;

public class Test2 {

    public static void main(String[] args) {
        int pay, tax;

        Scanner sc = new Scanner(System.in);

        System.out.print("과세 표준 입력(단위 만원): ");
        pay = sc.nextInt();

        switch (pay / 1000) {
            case 0:
                tax = (int) (pay * 0.08);
                break;

            case 1:
            case 2:
            case 3:
                tax = (int) (pay * 0.17);
                break;

            case 4:
            case 5:
            case 6:
            case 7:
                tax = (int) (pay * 0.26);
                break;

            default:
                tax = (int) (pay * 0.35);
                break;
        }

        System.out.println("소득세는 " + tax + "만원입니다.");
        sc.close();
    }
}
