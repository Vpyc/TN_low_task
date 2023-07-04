public class Algorithm {
    public static StringBuilder reverseStr(StringBuilder str) {
        StringBuilder temp = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            temp.append(str.charAt(i));
        }
        return temp;
    }
}
