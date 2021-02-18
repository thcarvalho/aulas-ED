public class Ex09 {
    static void run() {
        System.out.println(sumOdds(300));
    }

    static int sumOdds(int num) {
        int n = num;

        if (num == 1) {
            return n;
        }
        if (n % 2 != 0) {
            n = n + sumOdds(num - 2);
        } else {
            n = sumOdds(num - 1);
        }

        return n;
    }
}
