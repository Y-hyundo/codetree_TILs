import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++)
                arr[i][j] = sc.nextInt();
        }

        int max_cnt = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                int cnt = 0;
                for(int k = j; k < j + 3; k++) {
                    if(j + 3 > n)
                        break;
                    if(arr[i][k] == 1)
                        cnt++;
                }
                max_cnt = Math.max(max_cnt, cnt);
            }
        }

        System.out.println(max_cnt);
    }
}