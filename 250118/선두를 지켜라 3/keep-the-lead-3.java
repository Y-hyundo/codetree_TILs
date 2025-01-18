import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        long indexA = 0;
        long indexB = 0;

        ArrayList<Long> moveA = new ArrayList<>();
        ArrayList<Long> moveB = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            long v = sc.nextLong();
            int t = sc.nextInt();

            for(int j = 0; j < t; j++) {
                indexA += v;
                moveA.add(indexA);
            }
        }

        for(int i = 0; i < m; i++) {
            long v = sc.nextLong();
            int t = sc.nextInt();

            for(int j = 0; j < t; j++) {
                indexB += v;
                moveB.add(indexB);
            }
        }

        int cnt = 0;
        String winner = "AB";

        for(int i = 0; i < moveA.size(); i++) {
            String current_winner;
            if(moveA.get(i) > moveB.get(i))
                current_winner = "A";
            else if(moveA.get(i) == moveB.get(i))
                current_winner = "AB";
            else
                current_winner = "B";

            if(!current_winner.equals(winner))
                cnt++;
            
            winner = current_winner;
        }

        System.out.println(cnt);
    }
}