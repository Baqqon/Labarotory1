import java.util.Scanner;

public class ReverseArray {
    /**
     * Reverses an array in place without using additional data structure.
     *
     * @param arr    The input array.
     * @param start  The starting index.
     * @param end    The ending index.
     */
    public static void reverse(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        reverse(arr, start + 1, end - 1);
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
            reverse(arr, 0, n - 1);
            System.out.println("Reversed array:");
            for (int num : arr) {
                System.out.print(num + " ");
            }
        }
    }
}
