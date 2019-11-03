package io.github.hanchaa;

import java.util.Scanner;

public class Employee {
    static int cnt;
    final static int max_employee = 3;

    String name;
    int pay;

    public Employee(String name, int pay) {
        this.name = name;
        this.pay = pay;
        cnt++;
    }

    static int getCount() {
        return cnt;
    }

    public static void main(String[] args) {
        Employee[] emp = new Employee[Employee.max_employee];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < Employee.max_employee; i++) {
            System.out.print("이름>> ");
            String name = sc.next();

            System.out.print("연봉>> ");
            int pay = sc.nextInt();

            emp[i] = new Employee(name, pay);

            System.out.println("현재 직원 수 = " + Employee.getCount());
            System.out.println();
        }
        
        sc.close();
    }
}
