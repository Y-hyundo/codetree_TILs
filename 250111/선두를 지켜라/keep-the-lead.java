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
        String first = "";

        for(int i = 0; i < Math.min(moveA.size(), moveB.size()); i++) {
            if(i == 0) {
                if(moveA.get(i) >= moveB.get(i))
                    first = "A";
                else
                    first = "B";
            } else {
                String current_first = moveA.get(i) >= moveB.get(i) ? "A" : "B";
                if(!current_first.equals(first)) {
                    cnt++;
                    first = current_first;
                }
            }
        }

        System.out.println(cnt);
    }
}