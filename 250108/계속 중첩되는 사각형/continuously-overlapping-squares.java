import java.util.*;

public class Main {
    public static final int OFFSET = 100;
    public static final int MAX_R = 200;

    public static void main(String[] args) {
        // Please write your code here.\
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[][] color = new String[MAX_R + 1][MAX_R + 1];

        for(int i = 1; i <= n; i++) {
            int x1 = sc.nextInt() + OFFSET;
            int y1 = sc.nextInt() + OFFSET;
            int x2 = sc.nextInt() + OFFSET;
            int y2 = sc.nextInt() + OFFSET;

            for(int j = x1; j < x2; j++) {
                for(int k = y1; k < y2; k++) {
                    if(i % 2 == 1)
                        color[j][k] = "red";
                    else
                        color[j][k] = "blue";
                }
            }
        }
        
        int blue_w = 0;
        for(int i = 0; i <= MAX_R; i++) {
            for(int j = 0; j <= MAX_R; j++) {
                if(color[i][j] == null)
                    continue;
                
                if(color[i][j].equals("blue"))
                    blue_w++;
            }
        }

        System.out.println(blue_w);
    }
}