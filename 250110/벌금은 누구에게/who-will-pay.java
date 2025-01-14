import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int[] penalty = new int[m];
        int[] penalty_stu = new int[n + 1];

        for(int i = 0; i < m; i++)
            penalty[i] = sc.nextInt();

        for(int i = 0; i < m; i++) {
            int target = penalty[i];
            penalty_stu[target]++;
                    
            if(penalty_stu[target] >= k) {
                System.out.println(target);
                return;
            }
        }

        System.out.println(-1);
    }
}