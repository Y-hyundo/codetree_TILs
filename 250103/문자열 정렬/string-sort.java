import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        char[] strArr = str.toCharArray();
        Arrays.sort(strArr);
        String sortedStr = new String(strArr);
        System.out.println(sortedStr);
    }
}