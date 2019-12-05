package Homework.DEC04;

import java.io.*;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("입력>> ");
        int choice = sc.nextInt();

        sc.nextLine();

        if (choice == 1) {
            try {
                BufferedWriter bw = new BufferedWriter(new FileWriter("홍길동.txt"));

                System.out.print("데이터 입력>> ");
                String str = sc.nextLine();

                bw.write(str);
                bw.flush();
                System.out.println("파일로 저장됨!");

                bw.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        } else if (choice == 2) {
            try {
                BufferedReader br = new BufferedReader(new FileReader("홍길동.txt"));

                System.out.println("데이터 출력>> " + br.readLine());

                br.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        } else if (choice == 3) {
            try {
                BufferedReader br = new BufferedReader(new FileReader("홍길동.txt"));
                BufferedWriter bw = new BufferedWriter(new FileWriter("홍길동2.txt"));

                String str;
                while ((str = br.readLine()) != null)
                    bw.write(str);

                bw.flush();
                System.out.println("파일 복사 완료!");

                br.close();
                bw.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
