package CW1.zad6;

import java.util.Arrays;
import java.util.Random;

public class zad6 {
    public static void main(String[] args) {

        int[] arr = new int[9];

        for (int i = 0; i < arr.length; i++) {
            Random rand = new Random();
            arr[i] = rand.nextInt(1000 - 100 + 1) + 100;
        }

        System.out.println("Generated array: " + Arrays.toString(arr));

        Arrays.sort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}
