package Practice.OCT23;

public class Test2 {
    String title;
    String author;

    void show() {
        System.out.println(title + ":" + author);
    }

    public Test2() {
        this("", "");
    }

    public Test2(String title) {
        this(title, "작자미상");
    }

    public Test2(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public static void main(String[] args) {
        Test2 emptyBook = new Test2();
        emptyBook.show();

        Test2 loveStory = new Test2("춘향전");
        loveStory.show();

        Test2 littlePrince = new Test2("어린왕자", "생텍쥐페리");
        littlePrince.show();
    }
}
