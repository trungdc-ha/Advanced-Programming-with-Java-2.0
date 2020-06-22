package _09_automated_testing_tdd.fizz_buzz;

public class FizzBuzz {
    public static String traslate(int number) {
        if (number > 0) {
            if (number % 10 == 3) {
                return "Fizz";
            } else {
                int a = number / 10;
                if (a == 3) {
                    return "Fizz";
                } else if (a == 5) {
                    return "Buzz";
                }
            }
            if (number % 3 == 0 && number % 5 != 0) {
                return "Fizz";
            } else if (number % 5 == 0 && number % 3 != 0) {
                return "Buzz";
            } else if (number % 3 == 0) {
                return "FizzBuzz";
            } else {
                return "Hello";
            }
        }
        return "number must be > 0.";
    }

    public static void main(String[] args) {
        System.out.println(FizzBuzz.traslate(15));
    }
}
