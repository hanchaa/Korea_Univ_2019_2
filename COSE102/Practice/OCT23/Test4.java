package Practice.OCT23;

import java.util.Scanner;

public class Test4 {
    String title, author;

    public Test4(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Test4[] booklist = new Test4[2];

        for (int i = 0; i < booklist.length; i++) {
            System.out.print("제목>> ");
            String title = sc.nextLine();

            System.out.print("저자>> ");
            String author = sc.nextLine();

            booklist[i] = new Test4(title, author);
        }

        for (int i = 0; i < booklist.length; i++) {
            System.out.println("(" + booklist[i].title + ":" + booklist[i].author + ")");
        }
    }
}
