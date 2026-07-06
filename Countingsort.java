import java.util.Arrays;
import java.util.Scanner;

public class Countingsort {

    static void countingSort(int[] arr) {

        int max = Arrays.stream(arr).max().getAsInt();

        int[] count = new int[max + 1];

        for (int num : arr)
            count[num]++;

        int index = 0;

        for (int i = 0; i < count.length; i++) {

            while (count[i] > 0) {
                arr[index++] = i;
                count[i]--;
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter non-negative integers:");

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        countingSort(arr);

        System.out.println(Arrays.toString(arr));

        sc.close();
    }
}