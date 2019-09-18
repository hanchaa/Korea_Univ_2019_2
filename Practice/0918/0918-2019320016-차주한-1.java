package io.github.hanchaa;

public class Main
{

    public static void main(String[] args)
    {
        char a = 'A';
        char b = '글';
        char c = '\u0041';
        char d = '\uae00';

        System.out.println(a + ", " + b);
        System.out.println(c + "\n" + d);
        System.out.println("\"");
        System.out.println("\\");
        System.out.println("\t");

        //String toolName = "JDK";
        String toolName = new String("JDK");

        System.out.println(toolName + "출시");
        System.out.println(toolName + 12);
        System.out.println("(" + 3 + "," + 5 + ")");
    }
}
