import java.util.Scanner;

public class DigitChecker {
    /**
     * Checks if a string consists of only digits.
     *
     * @param s The input string.
     * @return True if the string consists of only digits, otherwise false.
     */
    public static boolean isAllDigits(String s) {
        if (s.isEmpty()) {
            return false;
        }
        for (char c : s.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a string: ");
            String s = scanner.nextLine();
            System.out.println(s + " - " + (isAllDigits(s) ? "Yes" : "No"));
        }
    }
}
