public class Ex11 {
    static void run() {
        System.out.println(calculateSerie(4));
    }

    static double calculateSerie(double num) {
        //Ainda não funciona

        int divisor = 1;
        if (num <= 1) {
            return num;
        }
        System.out.println(num);

        double total = 0;
        num--;
        total = total + calculateSerie(1 / (divisor + num));
        return total;
    }
}
