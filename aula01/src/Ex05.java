import javax.swing.*;
import java.util.Arrays;

public class Ex05 {
    static void run() {
        System.out.println("\nEx. 05");

        int[][] mat = new int[4][4];
        mat[0][0] = 1;
        mat[1][1] = 3;
        mat[2][2] = 9;
        mat[3][3] = 27;

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if (i != j) {
                    mat[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Informe um número"));
                }
            }
        }
        for (int i = 0; i < mat.length; i++) {
            System.out.println(Arrays.toString(mat[i]));
        }
    }
}
