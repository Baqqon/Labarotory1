import java.util.Scanner;

public class AverageCalculator {

    /**
     * Calculates the average of elements in an array.
     *
     * @param arr The input array.
     * @return The average of elements in the array.
     */
    public static double calculateAverage(double[] arr) {
        double sum = 0;
        for (double num : arr) {
            sum += num;
        }
        return sum / arr.length;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the number of elements: ");
            int n = scanner.nextInt();
            double[] arr = new double[n];
            System.out.println("Enter the elements:");
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextDouble();
            }
            double average = calculateAverage(arr);
            System.out.println("Average of elements: " + average);
        }
    }
}
