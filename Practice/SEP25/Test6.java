package Practice.SEP25;

import java.util.Scanner;

public class Test6 {

    public static void main(String[] args) {
        int score;
        char grade;

        Scanner sc = new Scanner(System.in);

        System.out.print("점수 입력(0~100) : ");
        score = sc.nextInt();

        switch (score / 10) {
            case 9:
                grade = 'A';
                break;

            case 8:
                grade = 'B';
                break;

            case 7:
                grade = 'C';
                break;

            case 6:
                grade = 'D';
                break;

            default:
                grade = 'F';
                break;
        }

        System.out.println("학점 : " + grade);

        sc.close();
    }
}
