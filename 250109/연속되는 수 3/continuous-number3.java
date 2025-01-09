import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        
        // 연속하여 동일한 부호의 숫자가 나오는 횟수를 구해보며,
        // 그 중 최댓값을 갱신
        int max = 0, cnt = 0;
        for(int i = 0; i < n; i++) {
            // Case 1
            if(i >= 1 && arr[i] * arr[i - 1] > 0)
                cnt++;
            // Case 2
            else
                cnt = 1;
            
            max = Math.max(max, cnt);
        }
        
        System.out.print(max);
    }
}