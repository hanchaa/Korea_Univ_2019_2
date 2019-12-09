package Practice.DEC04;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in); FileWriter fout = new FileWriter("test1.txt")) {
            while (true) {
                System.out.print("입력>> ");
                String name = sc.nextLine();
                if (name.length() == 0)
                    break;
                fout.write(name, 0, name.length());
                fout.write("\r\n", 0, 2);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
