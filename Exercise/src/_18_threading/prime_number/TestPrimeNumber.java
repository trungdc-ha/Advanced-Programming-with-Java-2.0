package _18_threading.prime_number;

public class TestPrimeNumber {
    public static void main(String[] args) {
        LazyPrimeFactorization lazyPrimeFactorization = new LazyPrimeFactorization();
        OptimizedPrimeFactorization optimizedPrimeFactorization = new OptimizedPrimeFactorization();
        optimizedPrimeFactorization.run();
        lazyPrimeFactorization.run();
    }
}
