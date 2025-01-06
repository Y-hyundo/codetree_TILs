import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int base = sc.nextInt();
        int[] digits = new int[20];
        int cnt = 0;

        while(true) {
            if(num < base) {
                digits[cnt++] = num;
                break;
            }

            digits[cnt++] = num % base;
            num /= base;
        }

        for(int i = cnt - 1; i >= 0; i--)
            System.out.print(digits[i]);
    }
}