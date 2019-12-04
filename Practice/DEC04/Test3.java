package Practice.DEC04;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test3 {
    public static void main(String[] args) {
        byte b[] = {7, 33, 3, 4, -1, 18};
        byte b2[] = new byte[6];

        try{
            FileOutputStream fout = new FileOutputStream(".\\src\\Practice\\DEC04\\test3.out");

            for(int i = 0; i < b.length; i++)
                fout.write(b[i]);

            fout.close();

            FileInputStream fin = new FileInputStream(".\\src\\Practice\\DEC04\\test3.out");

            int n = 0, c;
            while((c = fin.read()) != -1){
                b2[n] = (byte)c;
                n++;
            }
            for(int i = 0; i < b.length; i++)
                System.out.print(b2[i] + " ");

            fin.close();

        } catch(IOException e){
            System.out.println("저장 불가! 경로 확인!");
            return;
        }
        System.out.println("저장 성공!");
    }
}
