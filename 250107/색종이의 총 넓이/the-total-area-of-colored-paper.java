import java.util.*;

public class Main {
    public static final int OFFSET = 100;
    public static final int MAX_R = 200;

    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] arr = new int[MAX_R + 1][MAX_R + 1];

        for(int i = 0; i < n; i++) {
            int x = sc.nextInt() + OFFSET;
            int y = sc.nextInt() + OFFSET;

            for(int j = x; j < x + 8; j++) {
                for(int k = y; k < y + 8; k++) {
                    arr[j][k] = 1;
                }
            }
        }

        int width = 0;

        for(int i = 0; i <= MAX_R; i++) {
            for(int j = 0; j <= MAX_R; j++) {
                if(arr[i][j] == 1)
                    width++;
            }
        }

        System.out.println(width);
    }
}