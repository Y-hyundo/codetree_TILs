import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int t = sc.nextInt();

        int r = sc.nextInt();
        int c = sc.nextInt();
        String dir = sc.next();

        int[] dx = new int[]{0, 1, -1, 0};
        int[] dy = new int[]{1, 0, 0, -1};

        int dirNum = -1;
        if(dir.equals("L"))
            dirNum = 2;
        else if(dir.equals("R"))
            dirNum = 1;
        else if(dir.equals("U"))
            dirNum = 0;
        else
            dirNum = 3;

        for(int i = 0; i < t; i++) {
            int nx = c + dx[dirNum], ny = r + dy[dirNum];
            if(!inRange(nx, ny, n)) {
                dirNum = 3 - dirNum;
                continue;
            }

            c = c + dx[dirNum];
            r = r + dy[dirNum];
        }

        System.out.println(r + " " + c);        
    }

    public static boolean inRange(int x, int y, int n) {
        return (x >= 1 && x <= n && y >= 1 && y <= n);
    }
}