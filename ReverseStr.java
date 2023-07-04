import java.util.Scanner;

public class ReverseStr {
    public static void main(String[] args) {
        System.out.println("Введи строку...");
        Scanner in = new Scanner(System.in);
        StringBuilder str = new StringBuilder(in.nextLine());
        str = Algorithm.reverseStr(str);
        System.out.println(str);
    }
}
