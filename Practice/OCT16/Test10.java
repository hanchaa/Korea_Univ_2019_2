package Practice.OCT16;

public class Test10 {
    String title;
    String author;

    public Test10(String t) {
        title = t;
        author = "작자미상";
    }

    public Test10(String t, String a) {
        title = t;
        author = a;
    }

    public static void main(String[] args) {
        Test10 loveStory = new Test10("춘향전");
        Test10 littlePrince = new Test10("어린왕자", "생텍쥐페리");

        System.out.println(littlePrince.title + ":" + littlePrince.author);
        System.out.println(loveStory.title + ":" + loveStory.author);
    }
}
