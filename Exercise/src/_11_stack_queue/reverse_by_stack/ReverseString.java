package _11_stack_queue.reverse_by_stack;

import java.util.Stack;

public class ReverseString {
    public static void main(String[] args) {
        String strInput = "abcde";
        String[] mWord = strInput.split("");
        System.out.println("String before: " + strInput);
        Stack<String> myStack = new Stack<>();
        for (int index = 0; index < mWord.length; index++) {
            myStack.push(mWord[index]);
        }
        int index = 0;
        while (!myStack.isEmpty()) {
            mWord[index++] = myStack.pop();
        }
        System.out.println("String before: " + String.join("", mWord));
    }
}
