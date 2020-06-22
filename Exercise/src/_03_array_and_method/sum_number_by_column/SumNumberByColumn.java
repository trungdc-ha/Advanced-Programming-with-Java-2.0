package _03_array_and_method.sum_number_by_column;

import java.util.Scanner;

public class SumNumberByColumn {
    public static void main(String[] args) {
        int[][] a = new int[5][5];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input array two dimensional: ");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print("a[" + i + "][" + j + "]: ");
                a[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Please input column to sum: ");
        int colToSum = scanner.nextInt();
        int sum = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (j == colToSum) {
                    sum += a[i][j];
                }
            }
        }

        System.out.println("Sum: " + sum);
    }
}
