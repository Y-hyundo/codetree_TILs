import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[2 * n];
        
        for(int i = 0; i < arr.length; i++)
            arr[i] = sc.nextInt();

        Arrays.sort(arr);

        int max = -1;
        for(int i = 0; i < n; i++) {
            if(arr[i] + arr[(2 * n - 1 ) - i] > max)
                max = arr[i] + arr[(2 * n - 1) - i];
        }

        System.out.println(max);
    }
}