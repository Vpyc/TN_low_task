import java.util.Arrays;
public class NoRepeats {
    public static void main(String[] args) {
        int n = 8;
        int arr[] = {5,3,4,5,2,6,1,5};
        System.out.println(Arrays.toString(arr));
        int temp[] = new int[n];
        int length = deleteRepeats(arr,temp,n);
        for(int i = 0; i <length;i++){
            System.out.print(temp[i] + " ");
        }
    }
    public static int deleteRepeats(int[] arr, int[] temp,int n){
        int length = 0;
        for(int i = 0; i<n; i++){
            boolean f = true;
            for(int j = 0;j<length;j++){
                if(temp[j] == arr[i]){
                    f = false;
                }
            }
            if(f){
                temp[length] = arr[i];
                length++;
            }
        }
        return length;
    }
}
