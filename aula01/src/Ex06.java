public class Ex06 {
    static void run() {
        System.out.println(calculateFactorial(2));
    }

    static int calculateFactorial(int num) {
        if (num <= 2) {
            return num;
        }
        int factorial = num;

        factorial *= (calculateFactorial(num - 1));
        return factorial;
    }

}
