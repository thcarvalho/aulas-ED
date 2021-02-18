public class Ex07 {
    static void run() {
        System.out.println(sumNumbers(100));
    }
    static int sumNumbers(int num) {
        int n = num;
        if (num == 0) {
            return n;
        }
        n = n+sumNumbers(num-1);
        return n;
    }
}
