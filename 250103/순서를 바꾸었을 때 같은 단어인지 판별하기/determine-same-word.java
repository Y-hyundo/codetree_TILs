import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        Scanner sc = new Scanner(System.in);

        char[] word1 = sc.next().toCharArray();
        char[] word2 = sc.next().toCharArray();

        if(word1.length != word2.length) {
            System.out.println("No");
            return;
        }
        Arrays.sort(word1);
        Arrays.sort(word2);

        String sorted_word1 = new String(word1);
        String sorted_word2 = new String(word2);

        if(sorted_word1.equals(sorted_word2))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}