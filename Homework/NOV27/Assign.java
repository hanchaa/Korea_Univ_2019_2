package Homework.NOV27;

import java.util.Scanner;
import java.util.HashMap;

class Gen<T, K> {
    private T name;
    private K score;

    Gen() {
        name = null;
        score = null;
    }

    HashMap<T, K> list = new HashMap<T, K>();

    public void setItem(T n, K s) {
        name = n;
        score = s;
        list.put(n, s);
    }

    public K findItem(T n) {
        return list.get(n);
    }
}

public class Assign {
    static void init(Gen tmp) {
        String[] name = {"유재석", "강호동", "이경규"};
        int[] score = {70, 90, 80};

        for (int i = 0; i < 3; i++)
            tmp.setItem(name[i], score[i]);
    }

    public static void main(String[] args) {
        Gen<String, Integer> a = new Gen<>();
        Scanner sc = new Scanner(System.in);

        init(a);

        while (true) {
            System.out.print("이름> ");
            String name = sc.next();
            if (name.equals("quit"))
                break;

            //System.out.println(a.findItem(name));
        }
    }
}
