import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] dx = new int[]{1, 0, -1, 0};
        int[] dy = new int[]{0, -1, 0, 1};
        int x = 0, y = 0;
        int dirNum;

        for(int i = 0; i < n; i++) {
            String dir = sc.next();
            int d = sc.nextInt();

            if(dir.equals("N"))
                dirNum = 3;
            else if(dir.equals("S"))
                dirNum = 1;
            else if(dir.equals("E"))
                dirNum = 0;
            else
                dirNum = 2;
            
            x += dx[dirNum] * d;
            y += dy[dirNum] * d;
        }

        System.out.println(x + " " + y);
    }
}