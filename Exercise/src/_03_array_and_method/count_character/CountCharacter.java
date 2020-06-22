package _03_array_and_method.count_character;

import java.util.Scanner;

public class CountCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("input String: ");
        String str = scanner.nextLine();
        System.out.print("input character: ");
        Character chacr = scanner.next().charAt(0);
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == chacr) {
                count++;
            }
        }
        System.out.println("Occurrence of '" + chacr + "': " + count);
    }
}
