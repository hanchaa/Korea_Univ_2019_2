package Practice.NOV27;

import java.util.*;

public class Test3 {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 4; i++) {
            System.out.print("이름 입력>> ");
            String s = sc.next();
            a.add(s);
        }
        Iterator<String> it = a.iterator();

        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        int longest = 0;

        for (int i = 1; i < a.size(); i++) {
            if (a.get(longest).length() < a.get(i).length())
                longest = i;
        }

        System.out.println("\n가장 긴 이름: " + a.get(longest));
        
        sc.close();
    }
}
