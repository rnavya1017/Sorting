import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Bucketsort {

    static void bucketSort(float[] arr) {

        int n = arr.length;

        ArrayList<Float>[] buckets = new ArrayList[n];

        for (int i = 0; i < n; i++)
            buckets[i] = new ArrayList<>();

        for (float value : arr) {

            int index = (int) (value * n);

            buckets[index].add(value);
        }

        for (ArrayList<Float> bucket : buckets)
            Collections.sort(bucket);

        int k = 0;

        for (ArrayList<Float> bucket : buckets)

            for (float value : bucket)

                arr[k++] = value;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        float[] arr = new float[n];

        System.out.println("Enter decimal values (0 to 1):");

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextFloat();

        bucketSort(arr);

        System.out.println("Sorted Array:");

        for (float num : arr)
            System.out.print(num + " ");

        sc.close();
    }
}