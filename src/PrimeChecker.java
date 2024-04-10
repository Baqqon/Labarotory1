import java.util.Scanner;

public class PrimeChecker {

    /**
     * Checks whether a given number is prime.
     *
     * @param n The number to check.
     * @return True if the number is prime, false otherwise.
     */
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        if (isPrime(n)) {
            System.out.println(n + "Prime");
        } else {
            System.out.println(n + "Composite");
        }
        scanner.close();
    }
}
