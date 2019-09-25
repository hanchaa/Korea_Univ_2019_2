package io.github.hanchaa;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String month, result;

        Scanner sc = new Scanner(System.in);

        System.out.print("달의 이름 입력 : ");
        month = sc.next();

        if(month.equals("jan"))
            result = "1월";

        else if(month.equals("feb"))
            result = "2월";

        else if(month.equals("mar"))
            result = "3월";

        else
            result = "기타";

        System.out.println(result);

        sc.close();
    }
}
