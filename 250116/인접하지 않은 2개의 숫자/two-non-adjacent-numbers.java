import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int maxSum = 0;
        for(int i = 0; i < n - 2; i++) {
            for(int j = i + 2; j < n; j++) {
                int sum = arr[i] + arr[j];
                maxSum = Math.max(maxSum, sum);
            }
        }

        System.out.println(maxSum);
    }
}