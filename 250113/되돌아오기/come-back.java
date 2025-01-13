import java.util.*;

public class Main {
    public static final int MAX = 2000;

    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        
        int[][] arr = new int[MAX + 1][MAX + 1];
        int[] dx = new int[]{0, 1, 0, -1};
        int[] dy = new int[]{1, 0, -1, 0};
        int x = 1000, y = 1000, dir = 0;
        int second = 0;


        arr[x][y] = 1;
        for(int i = 0; i < n; i++) {
            String d = sc.next();
            int move = sc.nextInt();

            if(d.equals("E"))
                dir = 0;
            else if(d.equals("S"))
                dir = 1;
            else if(d.equals("W"))
                dir = 2;
            else
                dir = 3;

            for(int j = 0; j < move; j++) {
                x = x + dx[dir];
                y = y + dy[dir];
                second++;
                if(x == 1000 && y == 1000) {
                    System.out.println(second);
                    return;
                }
                arr[x][y] = 1;
            }
        }

        System.out.println(-1);
    }
}