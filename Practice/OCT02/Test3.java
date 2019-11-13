package Practice.OCT02;

public class Test3 {

    public static void main(String[] args) {
        String s = "no news is good news";

        int num = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != 'n') continue;

            num++;
        }

        System.out.println("문장 내 n의 개수 = " + num);
    }
}
