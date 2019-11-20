package Practice.NOV20;

import java.util.StringTokenizer;

public class Test2
{
    public static void main(String[] args) {
        String query = "name=kitae&addr=seoul&age=21";

        StringTokenizer st = new StringTokenizer(query, "&");
        System.out.println(st.countTokens());

        while(st.hasMoreTokens())
            System.out.println(st.nextToken());

        st = new StringTokenizer(query, "&=");
        System.out.println(st.countTokens());

        while(st.hasMoreTokens())
            System.out.println(st.nextToken());
    }
}
