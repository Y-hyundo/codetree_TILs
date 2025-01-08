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

        int max_continue = 0;
        boolean isChange = false;

        for(int j = 0; j < n; j++) {
            if(j == 0 || arr[j] != arr[j - 1]) {
                if(max_continue < continue_cnt)
                    max_continue = continue_cnt;
                continue_cnt = 0;
                if(j != 0)
                    isChange = true;
            }
            continue_cnt++;
        }
        if(isChange == false)
            max_continue = continue_cnt;

        System.out.println(max_continue);
    }
}