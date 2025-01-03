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

        for(int i = 0; i < word1.length; i++) {
            if(word1[i] != word2[i]) {
                System.out.println("No");
                return;
            }
        }

        System.out.println("Yes");
    }
}