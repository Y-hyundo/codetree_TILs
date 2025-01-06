import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] digit = new int[20];
        int index = 0;

        while(true) {
            if(n < 2) {
                digit[index++] = n;
                break;
            }

            digit[index++] = n % 2;
            n /= 2;
        }

        for(int i = index - 1; i >= 0; i--)
            System.out.print(digit[i]);
    }
}