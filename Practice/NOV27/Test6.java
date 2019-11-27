package Practice.NOV27;

import java.util.HashMap;
import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        HashMap<String, String> dic = new HashMap<String, String>();

        dic.put("baby", "아기");
        dic.put("love", "사랑");
        dic.put("apple", "사과");

        System.out.println(dic);
        System.out.println(dic.entrySet());
        System.out.println(dic.keySet());
        System.out.println(dic.values());

        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.print("단어? ");
            String key = sc.next();

            if(key.equals("exit")) {
                System.out.println("종료합니다...");
                break;
            }

            String value = dic.get(key);

            if(value == null)
                System.out.println("없는 단어!");
            else
                System.out.println(value);
        }
    }
}
