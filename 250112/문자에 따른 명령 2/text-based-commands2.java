import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        String cmd = sc.next();

        int[] dx = new int[]{1, 0, -1, 0};
        int[] dy = new int[]{0, -1, 0, 1};
        int x = 0, y = 0;
        int dirNum = 3;

        for(int i = 0; i < cmd.length(); i++) {
            if(cmd.charAt(i) == 'L')
                dirNum = (dirNum - 1) % 4;
            else if(cmd.charAt(i) == 'R')
                dirNum = (dirNum + 1) % 4;
            else {
                x += dx[dirNum];
                y += dy[dirNum];
            }
        }

        System.out.println(x + " " + y);
    }
}