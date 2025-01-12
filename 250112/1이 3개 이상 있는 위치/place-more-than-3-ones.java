import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        int[] dx = new int[]{0, 1, 0, -1};
        int[] dy = new int[]{1, 0, -1, 0};

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int cnt = 0;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                int countOne = 0;
                for(int dir = 0; dir < 4; dir++) {
                    int nx = i + dx[dir], ny = j + dy[dir];
                    if(inRange(nx, ny, n) && arr[nx][ny] == 1)
                        countOne++;
                }
                if(countOne >= 3)
                    cnt++;
            }
        }

        System.out.println(cnt);
    }

    public static boolean inRange(int x, int y, int n) {
        return (x >= 0 && x < n && y >= 0 && y < n);
    }
}