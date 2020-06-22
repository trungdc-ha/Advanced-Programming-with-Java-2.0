package _11_stack_queue.reverse_by_stack;

import java.util.Arrays;
import java.util.Stack;

public class ReverseIntegerArray {
    public static void main(String[] args) {
        int[] arrayInt = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.print("Array before reverse: " + Arrays.toString(arrayInt));
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < arrayInt.length; i++) {
            stack.push(arrayInt[i]);
        }
        int index = 0;
        while (!stack.isEmpty()) {
            arrayInt[index++] = stack.pop();
        }
        System.out.println();
        System.out.print("Array after reverse: " + Arrays.toString(arrayInt));
    }
}
