package _03_array_and_method.max_element_array_2d;

import java.util.Scanner;

public class MaxElementArray2D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter row of matrix: ");
        int rowMatrix = scanner.nextInt();
        System.out.print("Enter column of matrix: ");
        int colMatrix = scanner.nextInt();
        double[][] matrix = new double[rowMatrix][colMatrix];
        for (int row = 0; row < rowMatrix; row++) {
            for (int column = 0; column < colMatrix; column++) {
                System.out.print("Enter value of Matrix[" + row + "][" + column + "]: ");
                matrix[row][column] = scanner.nextDouble();
            }
        }

        double valueMax = matrix[0][0];
        int indexRowMax = 0;
        int indexColumn = 0;
        for (int row = 0; row < rowMatrix; row++) {
            for (int column = 0; column < colMatrix; column++) {
                System.out.print(matrix[row][column] + "\t");
                if (matrix[row][column] > valueMax) {
                    valueMax = matrix[row][column];
                    indexRowMax = row;
                    indexColumn = column;
                }
            }
            System.out.println();
        }
        System.out.println("Value max is: Matrix[" + indexRowMax + "][" + indexColumn + "] = " + valueMax);
    }
}
