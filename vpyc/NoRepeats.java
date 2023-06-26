package vpyc;

import java.util.Arrays;
public class NoRepeats {
    public static void main(String[] args) {
        int size = 8;
        int arr[] = {5, 3, 4, 5, 2, 6, 1, 5};
        System.out.println(Arrays.toString(arr));
        int newArr[] = new int[size];
        int length = Algorithm.deleteRepeats(arr, newArr, size);
        for (int i = 0; i < length; i++) {
            System.out.print(newArr[i] + " ");
        }
    }
}
