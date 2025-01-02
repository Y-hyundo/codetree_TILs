import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        System.out.println(find_max(arr, n - 1));
    }

    public static int find_max(int[] arr, int n) {
        if(n == 0)
            return arr[0];

        if(arr[n] > find_max(arr, n - 1))
            return arr[n];
        else
            return find_max(arr, n - 1);       
    }
}