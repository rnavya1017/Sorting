import java.util.Arrays;
import java.util.Scanner;

public class Quicksort {

    // Method to perform Quick Sort
    public static void quickSort(int[] arr, int low, int high) {

        if (low < high) {

            // Find partition index
            int pivotIndex = partition(arr, low, high);

            // Sort left sub-array
            quickSort(arr, low, pivotIndex - 1);

            // Sort right sub-array
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    // Partition method
    public static int partition(int[] arr, int low, int high) {

        // Choose last element as pivot
        int pivot = arr[high];

        int i = low - 1;

        for (int j = low; j < high; j++) {

            if (arr[j] <= pivot) {

                i++;

                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Place pivot in correct position
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Original Array: " + Arrays.toString(arr));

        quickSort(arr, 0, arr.length - 1);

        System.out.println("Sorted Array: " + Arrays.toString(arr));

        sc.close();
    }
}