import java.util.Arrays;

public class NoRepeats {
    public static void main(String[] args) {
        int size = 8;
        int arr[] = {5, 3, 4, 5, 2, 6, 1, 5};
        System.out.println(Arrays.toString(arr));
        int newArr[] = new int[size];
        int length = deleteRepeats(arr, newArr, size);
        for (int i = 0; i < length; i++) {
            System.out.print(newArr[i] + " ");
        }
    }

    public static int deleteRepeats(int[] arr, int[] temp, int n) {
        int length = 0;
        for (int i = 0; i < n; i++) {
            boolean flag = true;
            for (int j = 0; j < length; j++) {
                if (temp[j] == arr[i]) {
                    flag = false;
                }
            }
            if (flag) {
                temp[length] = arr[i];
                length++;
            }
        }
        return length;
    }
}
