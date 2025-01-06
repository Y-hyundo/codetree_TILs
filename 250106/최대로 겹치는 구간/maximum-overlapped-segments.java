import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int[] arr = new int[200];

        for(int i = 0; i < n; i++) {
            a[i] = sc.nextInt() + 100;
            b[i] = sc.nextInt() + 100;

            for(int j = a[i]; j < b[i]; j++)
                arr[j]++;
        }

        int max = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > max)
                max = arr[i];
        }

        System.out.println(max);
    }
}