import java.util.Random;

public class Ex01 {
    static void run() {
        System.out.println("\nEx. 01");

        double[] values = new double[100];
        double start = -100;
        double end = 1000;

        for (int i = 0; i < values.length; i++) {
            double random = start + ((new Random().nextDouble()) * (end - start));
            values[i] = random;
        }

        // Primeira parte
        double avgNumbers = 0;
        int avgLength = 0;
        for (double item : values) {
            if (item >= 100 && item <= 1000) {
                avgNumbers += item;
                avgLength++;
            }
        }
        double avgTotal = avgNumbers / avgLength;
        System.out.println(avgTotal);

        //Segunda Parte
        double sum = 0;
        for (double item : values) {
            sum += item;
        }
        double avg = sum / (values.length);
        System.out.println(avg);

        //Terceira parte
        double negativeSum = 0;
        for (double item : values) {
            if (item < 0){
                negativeSum+=item;
            }
        }
        System.out.println(negativeSum);
    }
}
