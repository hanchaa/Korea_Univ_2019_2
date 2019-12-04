package Practice.DEC04;

import java.io.*;

public class Test5 {
    public static void main(String[] args) throws IOException {
        DataInputStream din = null;
        DataOutputStream dos = null;
        try{
            FileOutputStream fos = new FileOutputStream("data.bin");
            dos = new DataOutputStream(new BufferedOutputStream(fos));
            dos.writeDouble(3.14);
            dos.writeInt(100);
            dos.writeUTF("사과 바나나 딸기 포도 귤");
            dos.flush();

            FileInputStream fis = new FileInputStream("data.bin");
            din = new DataInputStream(new BufferedInputStream(fis));
            double d = din.readDouble();
            int i = din.readInt();
            String s = din.readUTF();
            System.out.println(d + "\n" + i + "\n" + s);
        } finally {
            if(din != null) din.close();
            if(dos != null) dos.close();
        }
    }
}
