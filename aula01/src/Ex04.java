import java.util.Arrays;
import java.util.Random;

public class Ex04 {
    static void run() {
        System.out.println("\nEx. 04");

        int[][] mat = new int[4][4];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                mat[i][j] = new Random().nextInt(100) + 1;
            }
        }

        //Primeira parte
        int sum = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                sum += mat[i][j];
            }
        }
        System.out.println(sum);

        //Segunda parte
        int imp = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if (mat[i][j] >= 30 && mat[i][j] <= 50) {
                    if (mat[i][j] % 2 != 0) {
                        imp++;
                    }
                }
            }
        }
        System.out.println(imp);

        //Terceira parte
        int divBy8 = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if (mat[i][j] % 8 == 0) {
                    divBy8++;
                }
            }
        }
        System.out.println(divBy8);

        //Quarta parte
        int divBy3 = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if (mat[i][j] % 3 == 0) {
                    if (mat[i][j] % 2 == 1) {
                        divBy3++;
                    }
                }
            }
        }
        System.out.println(divBy3);

        //Quinta parte
        int highest = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if (mat[i][j] > highest) {
                    highest = mat[i][j];
                }
            }
        }
        long factorial = highest;
        for (int i = highest; i > 1; i--) {
            factorial *= (i - 1);
        }
        System.out.println(factorial);
    }
}
