import java.util.*;
import java.lang.*;

class Coordinate {
    int x, y, seq;

    public Coordinate(int x, int y, int seq) {
        this.x = x;
        this.y = y;
        this.seq = seq;
    }
}

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Coordinate[] c = new Coordinate[n];

        for(int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int seq = i + 1;

            c[i] = new Coordinate(x, y, seq);
        }

        Arrays.sort(c, (a, b) -> {
            int distanceA = Math.abs(a.x) + Math.abs(a.y);
            int distanceB = Math.abs(b.x) + Math.abs(b.y);

            return distanceA - distanceB;
        });

        for(int i = 0; i < n; i++)
            System.out.println(c[i].seq);
    }
}