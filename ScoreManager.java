package CoadingMatter.ex1;

public class ScoreManager {

    public static void main(String[] args) {
        int[] scores = {50, 60, 70, 80, 90};

        int max = getMax(scores);
        int min = getMin(scores);
        double avg = getAvg(scores);

        System.out.println("최대값 : " + max);
        System.out.println("최소값 : " + min);
        System.out.println("평균 : " + avg);
    }

    public static int getMax(int[] scores) {
        int max = 0;
        max = scores[0];
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] > max) {
                max = scores[i];
            }
        }
        return max;
    }
    public static int getMin(int[] scores) {
        int min = 0;
        min = scores[0];
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] < min) {
                min = scores[i];
            }
        }
        return min;
    }

    public static double getAvg(int[] scores){
        int sum = 0;
        for(int i = 0; i < scores.length; i++){
            sum += scores[i];
        }
        return (double) sum / scores.length;

    }
}
