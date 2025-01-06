import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        String n = sc.next();
        int num = 0;

        for(int i = 0; i < n.length(); i++) {
            num = num * a + (n.charAt(i) - '0');
        }

        int[] digits = new int[20];
        int cnt = 0;

        while(true) {
            if(num < b) {
                digits[cnt++] = num;
                break;
            }

            digits[cnt++] = num % b;
            num /= b;
        }

        for(int i = cnt - 1; i >= 0; i--)
            System.out.print(digits[i]);

    }
}