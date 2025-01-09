import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int continue_cnt = 0;
        int max_continue = 0;
        boolean isChange = false;

        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        for(int i = 0; i < n; i++) {
            if(i == 0 || arr[i] * arr[i - 1] < 0) {
                if(max_continue < continue_cnt)
                    max_continue = continue_cnt;
                continue_cnt = 0;
                isChange = true;
            }
            continue_cnt++;
        }

        if(!isChange) {
            max_continue = continue_cnt;
        }
        System.out.println(max_continue);
    }
}