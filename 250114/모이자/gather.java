import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int minSum = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++) {
            int distanceSum = 0;
            for(int j = 0; j < n; j++)
                distanceSum += Math.abs(j - i) * arr[j];

            minSum = Math.min(minSum, distanceSum);
        }

        System.out.println(minSum);
    }
}