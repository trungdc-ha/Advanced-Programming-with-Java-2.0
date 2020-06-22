package _19_string_regex.validate_class_name;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateClassName {
    private static Pattern pattern;
    private Matcher matcher;

    private static final String CLASS_NAME_REGEX = "^[CAP][/.,*&%!@$()||]{0}[0-9]{4}[GHIKLM]$";

    public ValidateClassName() {
        pattern = Pattern.compile(CLASS_NAME_REGEX);
    }

    public boolean validate(String regex) {
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }

    public static void main(String[] args) {
        ValidateClassName validateClassName = new ValidateClassName();
        Scanner scanner = new Scanner(System.in);
        String inputName;
        while (true) {
            inputName = scanner.nextLine();
            if (validateClassName.validate(inputName)) {
                System.out.println("Valid");
            } else {
                System.out.println("not valid");
            }
        }
    }
}
