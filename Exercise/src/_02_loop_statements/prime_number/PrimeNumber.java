package _02_loop_statements.prime_number;

public class PrimeNumber {
    private static int count = 0;

    private static boolean checkPrimeNumber(int a) {
        for (int i = 2; i < a; i++)
            if (a % i == 0)
                return false;
        return true;
    }

    public static void main(String[] args) {
        int i = 1;
        do {
            i++;
            if (checkPrimeNumber(i)) {
                System.out.print(i +" ");
                count++;
            }
        } while (count < 20);
    }
}
