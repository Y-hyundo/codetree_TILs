import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        int cnt = 0;
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '(') {
                for(int j = i + 1; j < str.length(); j++) {
                    if(str.charAt(j) == ')')
                        cnt++;
                }
            }
        }

        System.out.println(cnt);
    }
}