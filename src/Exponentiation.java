import java.util.Scanner;

public class Exponentiation {
    /**
     * Calculates the exponentiation of a number using recursion.
     *
     * @param a The base.
     * @param n The exponent.
     * @return The result of a raised to the power of n.
     */
    public static double power(double a, int n) {
        if (n == 0) {
            return 1;
        } else if (n < 0) {
            return 1 / power(a, -n);
        } else if (n % 2 == 0) {
            double half = power(a, n / 2);
            return half * half;
        } else {
            return a * power(a, n - 1);
        }
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the base (a): ");
            double a = scanner.nextDouble();
            System.out.print("Enter the exponent (n): ");
            int n = scanner.nextInt();
            System.out.println(a + " ^ " + n + " = " + power(a, n));
        }
    }
}
