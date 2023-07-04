public class Algorithm {
    public static boolean checkPalindrome(String str){
        boolean flag;
        int len = str.length();
        int index = len / 2;
        String firstHalfOfString = str.substring(0, index);
        String secondHalfOfString = str.substring(len - index, len);
        StringBuilder temp = reverseStr(secondHalfOfString);
        flag = firstHalfOfString.equals(temp.toString());
        return flag;
    }
    public static StringBuilder reverseStr(String str){
        StringBuilder temp = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            temp.append(str.charAt(i));
        }
        return temp;
    }
}
