import java.util.*;

public class Main {
    public static final int OFFSET = 1000;
    public static final int MAX_R = 2000;

    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int[][] rect = new int[MAX_R + 1][MAX_R + 1];
        int[] x1 = new int[2];
        int[] y1 = new int[2];
        int[] x2 = new int[2];
        int[] y2 = new int[2];
        
        
        for(int i = 0; i < 2; i++) {
            x1[i] = sc.nextInt() + OFFSET;
            y1[i] = sc.nextInt() + OFFSET;
            x2[i] = sc.nextInt() + OFFSET;
            y2[i] = sc.nextInt() + OFFSET;

            for(int j = x1[i]; j < x2[i]; j++) {
                for(int k = y1[i]; k < y2[i]; k++) {
                    if(i == 1) {
                        rect[j][k] = 0;
                    }
                    else {
                        rect[j][k] = 1;
                    }
                }
            }
        }

        int min_x = MAX_R;
        int min_y = MAX_R;
        int max_x = 0;
        int max_y = 0;
        boolean isRemain = false;

        for(int i = x1[0]; i < x2[0]; i++) {
            for(int j = y1[0]; j < y2[0]; j++) {
                if(rect[i][j] == 1) {
                    isRemain = true;

                    if(min_x > i)
                        min_x = i;
                    if(min_y > j)
                        min_y = j;
                    
                    if(max_x < i)
                        max_x = i;
                    
                    if(max_y < j)
                        max_y = j;
                }
            }
        }

        if(!isRemain) {
            System.out.println(0);
            return;
        }
        int width = max_x - min_x + 1;
        int height = max_y - min_y + 1;

        System.out.println(width * height);
    }
}