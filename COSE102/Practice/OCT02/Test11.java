package Practice.OCT02;

import java.util.Scanner;

public class Test11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("첫 번째 수: ");
        int i = sc.nextInt();

        System.out.print("두 번째 수: ");
        int j = sc.nextInt();

        try {
            System.out.println(i / j);
        } catch (ArithmeticException e) {
            System.out.println("0으로 나누기 오류 발생");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
