package _01_introduction_to_java.convert_currency;

import java.util.Scanner;

public class ConvertCurrency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input USD amount:");
        double usd = sc.nextDouble();
        System.out.printf("%f usd= %f vnd", usd, usd * 23000);
    }
}
