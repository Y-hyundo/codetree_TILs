import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];

        for(int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }

        int count = 1;

        for(int i = 0; i < n - 1; i++) {
            if(b[i] > a[i + 1] && a[i] < b[i + 1])
                count++;
        }

        System.out.println(count);
    }
}