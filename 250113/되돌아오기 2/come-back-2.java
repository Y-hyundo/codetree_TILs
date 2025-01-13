import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        String cmd = sc.next();
        int x = 0, y = 0, dir = 0;
        int[] dx = new int[]{0, 1, 0, -1};
        int[] dy = new int[]{1, 0, -1, 0};
        int second = 0;
        
        for(int i = 0; i < cmd.length(); i++) {
            char d = cmd.charAt(i);
            if(d == 'L')
                dir = (dir - 1 + 4) % 4;
            else if(d == 'R')
                dir = (dir + 1) % 4;
            else {
                x += dx[dir];
                y += dy[dir];
            }
            second++;
            if(x == 0 && y == 0) {
                System.out.println(second);
                return;
            }
        }

        System.out.println(-1);
    }
}