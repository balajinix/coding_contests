import java.util.ArrayList;
import java.util.Scanner;

public class A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x[] = {500, 1000, 1500, 2000, 2500};

        ArrayList<Integer> m = new ArrayList<Integer>();
        for (int i=0;i<5;i++) {
            m.add(scanner.nextInt());
        }
        ArrayList<Integer> w = new ArrayList<Integer>();
        for (int i=0;i<5;i++) {
            w.add(scanner.nextInt());
        }
        ArrayList<Integer> h = new ArrayList<Integer>();
        for (int i=0;i<2;i++) {
            h.add(scanner.nextInt());
        }
        scanner.close();
        double score = 0;
        for (int i=0;i<5;i++) {
            double tempScore = 0;
            tempScore = Math.max(0.3 * (double) x[i], ((1.0 - (double) m.get(i)/ (double) 250) * (double) x[i]) - 50.0 * (double) w.get(i));
            score += tempScore;
        }
        score += h.get(0) * 100;
        score -= h.get(1) * 50;
        int scoreInt = (int) score;
        System.out.println(scoreInt);
    }
}