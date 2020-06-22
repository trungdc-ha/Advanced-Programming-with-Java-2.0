package _03_array_and_method.merge_array;

import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size of Array 1: ");
        int sizeArr1 = scanner.nextInt();
        int[] array1 = new int[sizeArr1];
        int index = 0;
        while(index<sizeArr1){
            System.out.print("Array 1 - Enter value "+ (index+1) + ": ");
            array1[index] =  scanner.nextInt();
            index++;
        }

        System.out.print("Enter size of Array 2 :");
        int sizeArr2 = scanner.nextInt();
        int[] array2 = new int[sizeArr2];
        index = 0;
        while(index<sizeArr2){
            System.out.print("Array 1 - Enter value "+(index+1) + ": ");
            array2[index] =  scanner.nextInt();
            index++;
        }

        int[] array3 = new int[sizeArr1 + sizeArr2];
        for (int i = 0; i < array3.length; i++) {
            if (i < sizeArr1){
                array3[i] = array1[i];
            } else {
                array3[i] = array2[i-sizeArr1];
            }
        }

        System.out.print("Value of Array 1 with size is "+sizeArr1 + ": ");
        for (int valueX : array1){
            System.out.print(valueX +" ");
        }

        System.out.print("\nValue of Array 2 with size is "+sizeArr2 + ": ");
        for (int valueX : array2){
            System.out.print(valueX +" ");
        }

        System.out.print("\nValue of Array 3 with size is "+array3.length + ": ");
        for (int valueX : array3){
            System.out.print(valueX +" ");
        }
    }
}
