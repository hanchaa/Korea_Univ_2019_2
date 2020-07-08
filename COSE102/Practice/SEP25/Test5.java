package Practice.SEP25;

import java.util.Scanner;

public class Test5 {

    public static void main(String[] args) {
        String coffee;

        Scanner sc = new Scanner(System.in);

        System.out.print("에스프레소, 카푸치노, 카페라떼, 아메리카노\n커피 선택 : ");
        coffee = sc.next();

        switch (coffee) {
            case "에스프레소":
            case "카푸치노":
            case "카페라떼":
                System.out.println(coffee + " : 3500원");
                break;

            case "아메리카노":
                System.out.println(coffee + " : 2000원");
                break;

            default:
                System.out.println(coffee + " : 메뉴에 없습니다!");
                break;
        }

        sc.close();
    }
}
