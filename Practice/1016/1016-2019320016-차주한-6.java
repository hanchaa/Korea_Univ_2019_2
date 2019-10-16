package io.github.hanchaa;

import java.util.Scanner;

public class Rectangle {
    int width, height;

    public Rectangle() {
        width = 0;
        height = 0;
    }

    public double getArea() {
        return width * height;
    }

    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        Scanner sc = new Scanner(System.in);

        System.out.println("사각형의 면적: " + rect.getArea());

        System.out.print("너비 입력: ");
        rect.width = sc.nextInt();
        System.out.print("높이 입력: ");
        rect.height = sc.nextInt();

        System.out.println("사각형의 면적: " + rect.getArea());

        sc.close();
    }
}
