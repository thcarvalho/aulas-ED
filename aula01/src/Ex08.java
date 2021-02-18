public class Ex08 {
    static void run() {
        System.out.println(sumEvens(200));
    }

    static int sumEvens(int num) {
        int n = num;

        if (num == 0) {
            return n;
        }
        if (n % 2 == 0) {
            n = n + sumEvens(num - 2);
        }
        return n;
    }
}
