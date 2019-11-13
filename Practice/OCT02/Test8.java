package Practice.OCT02;

public class Test8 {

    enum Weekday {월, 화, 수, 목, 금}

    public static void main(String[] args) {
        String names[] = {"사과", "배", "체리", "딸기", "포도"};

        for (String s : names)
            System.out.print(s + " ");

        System.out.println();

        for (Weekday days : Weekday.values())
            System.out.print(days + "요일 ");

        System.out.println();
    }
}
