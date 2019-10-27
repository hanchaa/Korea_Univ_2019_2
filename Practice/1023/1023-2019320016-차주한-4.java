package io.github.hanchaa;

import java.util.Scanner;

public class Book {
    String title, author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Book[] booklist = new Book[2];

        for (int i = 0; i < booklist.length; i++) {
            System.out.print("제목>> ");
            String title = sc.nextLine();

            System.out.print("저자>> ");
            String author = sc.nextLine();

            booklist[i] = new Book(title, author);
        }

        for (int i = 0; i < booklist.length; i++) {
            System.out.println("(" + booklist[i].title + ":" + booklist[i].author + ")");
        }
    }
}
