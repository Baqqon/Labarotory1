import java.util.Scanner;

public class BinomialCoefficient {
    /**
     * Calculates the binomial coefficient using recursion.
     *
     * @param n The total number of items.
     * @param k The number of items to choose.
     * @return The binomial coefficient (n choose k).
     */
    public static int binomialCoefficient(int n, int k) {
        if (k == 0 || k == n) {
            return 1;
        }
        return binomialCoefficient(n - 1, k - 1) + binomialCoefficient(n - 1, k);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        System.out.print("Enter the value of k: ");
        int k = scanner.nextInt();
        System.out.println("C(" + n + ", " + k + ") = " + binomialCoefficient(n, k));
        scanner.close();
    }
}
