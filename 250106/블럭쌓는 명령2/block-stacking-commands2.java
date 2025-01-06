import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
         
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] blocks = new int[n];
        for(int i = 0; i < k; i++) {
            int start = sc.nextInt() - 1;
            int end = sc.nextInt() - 1;
            for(int j = start; j <= end; j++) {
                blocks[j]++;
            }
        }

        int max = 0;
        for(int i = 0; i < blocks.length; i++) {
            if(blocks[i] > max)
                max = blocks[i];
        }
        System.out.println(max);
    }
}