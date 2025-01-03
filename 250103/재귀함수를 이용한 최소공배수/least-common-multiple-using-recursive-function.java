import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        System.out.println(find_lcm(arr, n - 1));
    }

    public static int find_lcm(int[] arr, int n) {
        if(n == 0)
            return arr[0];
        
        int i = 1;
        int b = find_lcm(arr, n - 1);
        while(true) {
            int a = arr[n] * i;
            
            if(a % b == 0)
                return a;

            i++;
        }
    }
}