package _02_loop_statements.prime_number_less100;

public class PrimeNumberLess100 {
    public static void main(String[] args) {
        int i = 1;
        do {
            i++;
            if (checkPrimeNumber(i))
                System.out.print(i + " ");
        } while (i < 100);
    }

    private static boolean checkPrimeNumber(int a) {
        for (int i = 2; i < a; i++)
            if (a % i == 0)
                return false;
        return true;
    }
}
