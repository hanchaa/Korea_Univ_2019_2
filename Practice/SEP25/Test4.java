package Practice.SEP25;

import java.util.Scanner;

public class Test4 {

    public static void main(String[] args) {
        int score, grade;

        Scanner sc = new Scanner(System.in);

        System.out.print("점수 입력(0~100) : ");
        score = sc.nextInt();

        System.out.print("학년 입력(1~4) : ");
        grade = sc.nextInt();

        if (grade >= 4) {
            if (score >= 70)
                System.out.println("합격!");
            else
                System.out.println("불합격!");
        }

        else {
            if (score >= 60)
                System.out.println("합격!");
            else
                System.out.println("불합격!");
        }

        sc.close();
    }
}
