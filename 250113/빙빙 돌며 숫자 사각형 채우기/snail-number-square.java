import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr = new int[n][m];
        int x = 0, y = 0;

        int[] dx = new int[]{0, 1, 0, -1};
        int[] dy = new int[]{1, 0, -1, 0};
        int dirNum = 0;

        arr[x][y] = 1;
        for(int i = 2; i <= n * m; i++) {
            int nx = x + dx[dirNum], ny = y + dy[dirNum];

            if(!inRange(nx, ny, n, m) || arr[nx][ny] != 0)
                dirNum = (dirNum + 1) % 4;

            x = x + dx[dirNum];
            y = y + dy[dirNum];
            arr[x][y] = i;
        }

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }
    }

    public static boolean inRange(int x, int y, int n, int m) {
        return (x >= 0 && x < n && y >= 0 && y < m);
    }
}