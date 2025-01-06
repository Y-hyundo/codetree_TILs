import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int[] panel = new int[200];

        for(int i = 0; i < n; i++) {
            int x1 = sc.nextInt();
            int x2 = sc.nextInt();
            if(x1 < 0)
                x1 += 100;
            if(x2 < 0)
                x2 += 100;
            a[i] = x1;
            b[i] = x2;
        }

        for(int i = 0; i < n; i++) {
            for(int j = a[i]; j < b[i]; j++) {
                panel[j]++;
            }
        }

        int max = 0;
        for(int i = 0; i < panel.length; i++) {
            if(panel[i] > max)
                max = panel[i];
        }
        
        System.out.println(max);
    }
}