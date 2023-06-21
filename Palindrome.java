import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        System.out.println("Введи строку...");
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        boolean f = checkPalindrome(str);
        if (f){
            System.out.println("Эта строка палиндром");
        }
        else{
            System.out.println("Эта строка не палиндром");
        }
    }
    public static boolean checkPalindrome(String str){
        boolean f;
        int len = str.length();
        int index = len / 2;
        String first = str.substring(0, index);
        String second = str.substring(len - index, len);
        StringBuilder temp = reverseStr(second);
        f = first.equals(temp.toString());
        return f;
    }
    public static StringBuilder reverseStr(String str){
        StringBuilder temp = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            temp.append(str.charAt(i));
        }
        return temp;
    }

}