import java.util.Scanner;
public class ReverseStr {
    public static void main(String[] args) {
        System.out.println("Введи строку...");
        Scanner in = new Scanner(System.in);
        StringBuilder str = new StringBuilder(in.nextLine());
        str = reverseStr(str);
        System.out.println(str);
    }
    public static StringBuilder reverseStr(StringBuilder str){
        StringBuilder temp = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            temp.append(str.charAt(i));
        }
        return temp;
    }
}
