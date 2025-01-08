import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        int continue_cnt = 0;

        if(n == 1) {
            System.out.println(1);
            return;
        }

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        int num_continue = 0;

        for(int j = 0; j < n; j++) {
            if(j == 0 || arr[j] != arr[j - 1]) {
                if(continue_cnt < num_continue)
                    continue_cnt = num_continue;
                num_continue = 0;
            }
            num_continue++;
        }

        System.out.println(continue_cnt);
    }
}