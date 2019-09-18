package io.github.hanchaa;

public class Main {

    public static void main(String[] args) {
        int i = 1;
        double j = 2.2;
        System.out.print("\n");
        System.out.println();
        System.out.print(i + "\n");
        System.out.println(i);
        System.out.print(i + j + "\n");
        System.out.println(i + j);
        System.out.println("결과="+i+j);
        System.out.printf("%d+%.1f=%.1f", i, j, i + j);
    }
}
