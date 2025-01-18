import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int indexA = 0;
        int indexB = 0;

        ArrayList<Integer> moveA = new ArrayList<>();
        ArrayList<Integer> moveB = new ArrayList<>();

        moveA.add(0);
        moveB.add(0);

        for(int i = 0; i < n; i++) {
            int v = sc.nextInt();
            int t = sc.nextInt();

            for(int j = 0; j < t; j++) {
                indexA += v;
                moveA.add(indexA);
            }
        }

        for(int i = 0; i < m; i++) {
            int v = sc.nextInt();
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