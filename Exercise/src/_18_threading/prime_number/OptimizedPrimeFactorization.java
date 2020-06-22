package _18_threading.prime_number;

public class OptimizedPrimeFactorization implements Runnable {

    @Override
    public void run() {
        int num = 2;
        boolean check = true;
        while (num < 100) {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    check = false;
                }
            }
            if (check) {
                System.out.println("OptimizedPrimeFactorization: " + num);
            }
            check = true;
            num++;
        }

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
