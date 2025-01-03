import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if((i + 1) % 2 == 1) {
                int[] arr2 = new int[i + 1];
                for(int j = 0; j < arr2.length; j++) {
                    arr2[j] = arr[j];
                }
                Arrays.sort(arr2);
                System.out.print(arr2[i / 2] + " ");
            }
        }
    }
}