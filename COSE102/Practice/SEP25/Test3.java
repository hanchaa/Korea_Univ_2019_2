package Practice.SEP25;

import java.util.Scanner;

public class Test3 {

    public static void main(String[] args) {
        int score;

        Scanner sc = new Scanner(System.in);

        System.out.print("점수 입력(0~100) : ");
        score = sc.nextInt();

        System.out.print("학점 : ");

        if (score >= 90)
            System.out.println("A");

        else if (score >= 80)
            System.out.println("B");

        else if (score >= 70)
            System.out.println("C");

        else if (score >= 60)
            System.out.println("D");

        else
            System.out.println("F");

        sc.close();
    }
}
