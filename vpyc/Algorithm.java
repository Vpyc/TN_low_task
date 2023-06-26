package vpyc;

public class Algorithm {
    public static int deleteRepeats(int[] arr, int[] newArr, int n) {
        int length = 0;
        for (int i = 0; i < n; i++) {
            boolean flag = true;
            for (int j = 0; j < length; j++) {
                if (newArr[j] == arr[i]) {
                    flag = false;
                }
            }
            if (flag) {
                newArr[length] = arr[i];
                length++;
            }
        }
        return length;
    }
}
