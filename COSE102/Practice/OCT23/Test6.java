package Practice.OCT23;

import java.util.Scanner;

public class Test6 {
    private static double rate;

    public static double toDollar(double won) {
        return won / rate;
    }

    public static double toKWR(double dollar) {
        return dollar * rate;
    }

    public static void setRate(double r) {
        rate = r;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("환율(1달러)>> ");
        double rate = sc.nextDouble();
        Test6.setRate(rate);

        System.out.println("원화 입력>> ");
        int won = sc.nextInt();
        System.out.println("$" + Test6.toDollar(won));

        System.out.print("달러 입력>> ");
        int dol = sc.nextInt();
        System.out.println(Test6.toKWR(dol) + "원");

        sc.close();
    }
}
