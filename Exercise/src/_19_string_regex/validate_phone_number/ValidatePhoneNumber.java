package _19_string_regex.validate_phone_number;

import _19_string_regex.validate_class_name.ValidateClassName;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatePhoneNumber {
    private static Pattern pattern;
    private Matcher matcher;

    private static final String PHONE_NUMBER_REGEX = "^[(][0-9][1-9][)][-][(][0][0-9]{9}[)]$";

    public ValidatePhoneNumber() {
        pattern = Pattern.compile(PHONE_NUMBER_REGEX);
    }

    public boolean validate(String regex) {
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }

    public static void main(String[] args) {
        ValidatePhoneNumber validatePhoneNumber = new ValidatePhoneNumber();
        Scanner scanner = new Scanner(System.in);
        String inputName;
        while (true) {
            inputName = scanner.nextLine();
            if (validatePhoneNumber.validate(inputName)) {
                System.out.println("Valid");
            } else {
                System.out.println("not valid");
            }
        }
    }
}
