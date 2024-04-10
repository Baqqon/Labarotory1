import java.util.Scanner;

public class Fibonacci {
    /**
     * Calculates the nth Fibonacci number using recursion.
     *
     * @param n The index of the Fibonacci number to find.
     * @return The nth Fibonacci number.
     */
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the value of n: ");
            int n = scanner.nextInt();
            System.out.println("Fibonacci(" + n + "): " + fibonacci(n));
        }
    }
}
