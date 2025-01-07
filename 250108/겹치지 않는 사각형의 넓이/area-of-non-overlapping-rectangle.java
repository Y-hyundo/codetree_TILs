import java.util.*;

public class Main {
    public static final int OFFSET = 1000;
    public static final int MAX_R = 2000;

    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[MAX_R + 1][MAX_R + 1];

        for(int i = 1; i <= 3; i++) {
            int x1 = sc.nextInt() + OFFSET;
            int y1 = sc.nextInt() + OFFSET;
            int x2 = sc.nextInt() + OFFSET;
            int y2 = sc.nextInt() + OFFSET;

            if(i == 3) {
                for(int j = x1 ; j < x2; j++) {
                    for(int k = y1; k < y2; k++) {
                        arr[j][k] = 0;
                    }
                }
            } else {
                for(int j = x1; j < x2; j++) {
                    for(int k = y1; k < y2; k++) {
                        arr[j][k] = 1;
                    }
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