package Practice.DEC04;

import java.io.*;

public class Test4 {
    public static void main(String[] args) throws IOException {
        FileInputStream file = new FileInputStream(".\\src\\Practice\\DEC04\\japan.txt");
        BufferedReader in = new BufferedReader(new InputStreamReader(file, "UTF-16"));

        String str;
        while((str = in.readLine()) != null)
            System.out.println(str);

        in.close();
        file.close();
    }
}
