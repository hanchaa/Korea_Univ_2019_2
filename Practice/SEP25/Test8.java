package Practice.SEP25;

import java.util.Scanner;

public class Test8 {

    public static void main(String[] args) {
        int cnt = 0, sum = 0, tmp;

        Scanner sc = new Scanner(System.in);

        System.out.print("정수 입력(종료:-1) : ");

        while (true) {
            tmp = sc.nextInt();

            if (tmp == -1)
                break;

            sum += tmp;
            cnt++;
        }

        if (cnt == 0)
            System.out.println("입력된 수 없음!");
        else {
            System.out.println("정수의 개수 = " + cnt + "개");
            System.out.println("평균 = " + (double) sum / cnt);
        }

        sc.close();
    }
}
