import java.util.Scanner;

public class GCD {
    /**
     * Finds the greatest common divisor (GCD) of two numbers using recursion (Euclidean Algorithm).
     *
     * @param a The first number.
     * @param b The second number.
     * @return The GCD of the two numbers.
     */
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("a: ");
            int a = scanner.nextInt();
            System.out.print("b: ");
            int b = scanner.nextInt();
            System.out.println(gcd(a, b));
        }
    }
}
