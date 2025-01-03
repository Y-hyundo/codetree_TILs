import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        String[] words = new String[sc.nextInt()];
        for(int i = 0; i < words.length; i++)
            words[i] = sc.next();

        Arrays.sort(words);
        for(int i = 0; i < words.length; i++)
            System.out.println(words[i]);
    }
}