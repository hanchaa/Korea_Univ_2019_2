package Practice.OCT02;

public class Test9 {
    public static void main(String[] args) {
        int[][] num = {{10, 20, 30, 40}, {50, 60, 70, 80}, {90, 100, 110, 120}};

        for (int[] x : num) {
            for (int y : x) {
                System.out.print(y + " ");
            }
            System.out.println();
        }
    }
}
