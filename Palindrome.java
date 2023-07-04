import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        System.out.println("Введи строку...");
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        boolean flag = Algorithm.checkPalindrome(str);
        if (flag){
            System.out.println("Эта строка палиндром");
        }
        else{
            System.out.println("Эта строка не палиндром");
        }
    }

}