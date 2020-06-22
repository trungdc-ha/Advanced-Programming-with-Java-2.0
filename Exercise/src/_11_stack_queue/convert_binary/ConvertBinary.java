package _11_stack_queue.convert_binary;

import java.util.Scanner;
import java.util.Stack;

public class ConvertBinary {

    public String convertNumber(int decimal, int radix) {
        Stack<Integer> stack = new Stack<>();
        while (decimal != 0) {
            stack.push(decimal % radix);
            decimal = decimal / radix;
        }
        String result = "";
        while (!stack.isEmpty()) {
            if (radix == 16) {
                result += convertToHexa(stack.pop());
            }else {
                result += stack.pop();
            }
        }
        return result;
    }

    public String convertToHexa(int number) {
        String str = "";
        if (number > 15) {
            str += number;
        } else {
            switch (number) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    str += number;
                    break;
                case 10:
                    str = "A";
                    break;
                case 11:
                    str = "B";
                    break;
                case 12:
                    str = "C";
                    break;
                case 13:
                    str = "D";
                    break;
                case 14:
                    str = "E";
                    break;
                case 15:
                    str = "F";
                    break;
            }
        }
        return str;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so nguyen: ");
        int inputDecimal = scanner.nextInt();
        System.out.println(Integer.toBinaryString(inputDecimal));
        System.out.println(Integer.toHexString(inputDecimal));

        ConvertBinary convertBinary = new ConvertBinary();
        System.out.println(convertBinary.convertNumber(inputDecimal, 2));
        System.out.println(convertBinary.convertNumber(inputDecimal, 16));

    }
}
