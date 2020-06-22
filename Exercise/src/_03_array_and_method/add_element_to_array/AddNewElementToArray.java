package _03_array_and_method.add_element_to_array;

import java.util.ArrayList;
import java.util.Scanner;

public class AddNewElementToArray {
    public static void main(String[] args) {
        int[] arrayInt = {10, 4, 6, 7, 8, 0, 0, 0, 0, 0};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value of X:");
        int valueX = scanner.nextInt();
        System.out.print("Enter index of X:");
        int index = scanner.nextInt();

        // Kiem tra gia tri index nhap vao la hop le
        if (index < 1 || index >= arrayInt.length - 1) {
            System.out.println("Index input uncorrect.");
        } else {
            // In ra gia tri cua mang truoc khi update
            System.out.print("Old array: ");
            for (int a : arrayInt) {
                System.out.print(a + ",");
            }

            for (int i = 0; i < arrayInt.length; i++) {
                if (index == i) {
                    for (int j = arrayInt.length - 1; j >= i; j--) {
                        arrayInt[j] = arrayInt[j - 1];
                    }
                    arrayInt[i] = valueX;
                }
            }

            // In gia tri cua mang sau khi update
            System.out.print("\nNew array: ");
            for (int a : arrayInt) {
                System.out.print(a + ",");
            }
        }
        ArrayList test = new ArrayList();
        test.add("a");

    }
}
