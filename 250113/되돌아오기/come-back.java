import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] dx = new int[]{0, 1, 0, -1};
        int[] dy = new int[]{1, 0, -1, 0};
        int x = 0, y = 0, dir = 0;
        int second = 0;

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
                x += dx[dir];
                y += dy[dir];
                second++;
                if(x == 0 && y == 0) {
                    System.out.println(second);
                    return;
                }
            }
        }

        System.out.println(-1);
    }
}