public class Ex10 {
    static void run(){
        System.out.println(calculateFibonacci(40));
    }

    static int calculateFibonacci(int num) {
        //Ainda não funciona

        int fiboNum = 0;
        int numA = 0;
        int numB = 1;
        int numC = 0;
        if (num == fiboNum) {
            return numC;
        }
        numC = numA + numB;
        numA = numB;
        numB = numC;
        fiboNum = calculateFibonacci(num-1);
        return fiboNum;
    }
}
