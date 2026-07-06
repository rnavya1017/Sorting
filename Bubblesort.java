import java.util.Arrays;
import java.util.Scanner;

public class Bubblesort {
    
public static void bubbleSort(int[] arr) {
int n = arr.length;
boolean swapped;
for (int i = 0; i < n - 1; i++) {
swapped = false;
for (int j = 0; j < n - i - 1; j++) {
if (arr[j] > arr[j + 1]) {
// Swap arr[j] and arr[j+1]
int temp = arr[j];
arr[j] = arr[j + 1];
arr[j + 1] = temp;
swapped = true;
}
}
if (!swapped) break; // Optimization: Stop if no swaps occurred
}
}
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int[] arr =new int[n];
    for (int i = 0; i < n; i++) {
       arr[i] = scanner.nextInt();
     
    }
bubbleSort(arr);
System.out.println(Arrays.toString(arr));
}
}