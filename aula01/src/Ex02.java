import java.util.Arrays;

public class Ex02 {
    static void run() {
        System.out.println("\nEx. 02");

        int[] arr = {5, 10, 9, 3, 6};

        int[] factorials = new int[5];
        for (int i = 0; i < arr.length; i++) {
            factorials[i] = calculateFactorial(arr[i]);
        }

        System.out.println(Arrays.toString(factorials));
    }

    static int calculateFactorial(int num) {
        int factorial = num;
        factorial = num * calculateFactorial(num - 1);
        return factorial;
    }
}
