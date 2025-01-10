import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int[] penalty = new int[m];
        int[] penalty_stu = new int[n];

        for(int i = 0; i < m; i++)
            penalty[i] = sc.nextInt();

        int[] students = new int[n];
        for(int i = 1; i <= n; i++)
            students[i - 1] = i;

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(penalty[i] == students[j])
                    penalty_stu[j]++;
                    
                if(penalty_stu[j] >= k) {
                    System.out.println(students[j]);
                    return;
                }
            }
        }
    }
}