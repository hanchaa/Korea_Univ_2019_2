package Practice.DEC04;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test7 {
    public static void main(String[] args) {
        File src = new File("C:\\Windows\\Web\\4K\\Wallpaper\\Windows\\img0_2560x1600.jpg");
        File dest = new File("copyimg.jpg");
        int c;

        try{
            FileInputStream fi = new FileInputStream(src);
            FileOutputStream fo = new FileOutputStream(dest);
            byte[] buf = new byte[1024*10];
            while(true){
                int n = fi.read(buf);
                fo.write(buf, 0, n);
                if(n < buf.length) break;
            }
            fi.close();
            fo.close();
            System.out.println(src.getPath() + "를 " + dest.getPath() + "로 복사함");
        } catch(IOException e){
            System.out.println("파일 복사 오류");
        }

    }
}
