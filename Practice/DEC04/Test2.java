package Practice.DEC04;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test2 {
    public static void main(String[] args) {
        FileInputStream fin = null;
        InputStreamReader in = null;
        try {
            fin = new FileInputStream("test2.txt");
            in = new InputStreamReader(fin, "MS949");

            System.out.println("인코딩 문자 집합: " + in.getEncoding());
            int c;
            while ((c = in.read()) != -1)
                System.out.print((char) c);

            in.close();
            fin.close();
        } catch (IOException e) {
            System.out.println("입출력 오류");
        }
    }
}
