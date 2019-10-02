package io.github.hanchaa;

public class Main {
    public static void main(String[] args) {
        double[][] score = {{3.3, 3.4}, {3.5, 3.6}, {3.7, 4.0}, {4.1, 4.2}};

        double sum = 0;

        for(int i = 0; i < score.length; i++){
            for(int j = 0; j < score[0].length; j++){
                sum += score[i][j];
            }
        }

        System.out.println("전체 평점 평균 : " + sum / (score[0].length * score.length));
    }
}
