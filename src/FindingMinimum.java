import java.util.Scanner;

public class FindingMinimum {
    /**
     * Finds the minimum element in an array using a recursive approach.
     *
     * @param arr The input array.
     * @param n   The number of elements in the array.
     * @return The minimum element in the array.
     */
    public static int findMinimum(int[] arr, int n) {
        if (n == 1) {
            return arr[0];
        }
        int min = findMinimum(arr, n - 1);
        return Math.min(min, arr[n - 1]);
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the number of elements: ");
            int n = scanner.nextInt();
            int[] arr = new int[n];
            System.out.println("Enter the elements:");
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
            int minRecursive = findMinimum(arr, n);
            System.out.println("Minimum element is " + minRecursive);
        }
    }
}
