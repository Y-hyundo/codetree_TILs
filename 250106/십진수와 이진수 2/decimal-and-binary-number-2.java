import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        String binary = sc.next();
        int num = 0;

        for(int i = 0; i < binary.length(); i++) {
            num = num * 2 + (binary.charAt(i) - '0');
        }
        num *= 17;

        int[] digits = new int[20];
        int cnt = 0;

        while(true) {
            if(num < 2) {
                digits[cnt++] = num;
                break;
            }

            digits[cnt++] = num % 2;
            num /= 2;
        }

        for(int i = cnt - 1; i >= 0; i--)
            System.out.print(digits[i]);
    }
}