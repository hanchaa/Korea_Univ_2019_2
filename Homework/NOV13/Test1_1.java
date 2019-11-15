package Homework.NOV13;

import java.util.Scanner;

public class Test1_1 {
    public static void main(String[] args) {
        Animal[] animals = new Animal[5]; //객체 배열
        Scanner sc = new Scanner(System.in);

        int cnt = 0;

        while (cnt < 5) {
            System.out.print("번호 선택(1~3): ");
            int num = sc.nextInt();
            if (num < 1 || num > 3) {
                System.out.println("종료합니다.");
                break;
            }

            switch (num) {
                case 1:
                    animals[cnt] = new Dog("개", "Gold");
                    break;

                case 2:
                    animals[cnt] = new Chicken("닭", "Red");
                    break;

                case 3:
                    animals[cnt] = new Cat("고양이", "Gray");
                    break;
            }

            System.out.println("<" + animals[cnt].getName() + ">");
            System.out.println("색상: " + animals[cnt].getColor());
            System.out.println("특기: " + animals[cnt].speciality());
            System.out.println("소리: " + animals[cnt].sound());
            System.out.println();

            cnt++;
        }
        
        sc.close();
    }
}
