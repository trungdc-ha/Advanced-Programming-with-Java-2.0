package _03_array_and_method.min_element_array;

import java.util.Scanner;

public class MinElementArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size of Array: ");
        int[] array = new int[scanner.nextInt()];
        int index = 0;

        while (index < array.length) {
            System.out.print("Enter value of index " + index + ": ");
            array[index] = scanner.nextInt();
            index++;
        }

        int minValue = array[0];
        System.out.print("Value of Array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
            if (array[i] < minValue) {
                minValue = array[i];
            }
        }
        System.out.println("\nMin value is: " + minValue);
    }
}
