package Homework.OCT23;

import java.util.Scanner;

public class Test1 {
    static int cnt;
    final static int max_employee = 3;

    String name;
    int pay;

    public Test1(String name, int pay) {
        this.name = name;
        this.pay = pay;
        cnt++;
    }

    static int getCount() {
        return cnt;
    }

    public static void main(String[] args) {
        Test1[] emp = new Test1[Test1.max_employee];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < Test1.max_employee; i++) {
            System.out.print("이름>> ");
            String name = sc.next();

            System.out.print("연봉>> ");
            int pay = sc.nextInt();

            emp[i] = new Test1(name, pay);

            System.out.println("현재 직원 수 = " + Test1.getCount());
            System.out.println();
        }

        sc.close();
    }
}
