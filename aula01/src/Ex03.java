import java.util.Arrays;
import java.util.Random;

public class Ex03 {
    static void run() {
        System.out.println("\nEx. 03");

        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Random().nextInt(200) - 100;
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < (arr.length - 1); j++) {
                if (arr[j] > arr[j+1]) {
                    int aux = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = aux;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
