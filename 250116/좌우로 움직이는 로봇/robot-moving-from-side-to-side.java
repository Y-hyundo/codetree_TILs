import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        ArrayList<Integer> moveA = new ArrayList<>();
        ArrayList<Integer> moveB = new ArrayList<>();

        int indexA = 0;
        int indexB = 0;

        // moveA.add(0);
        // moveB.add(0);

        for(int i = 0; i < n; i++) {
            int t = sc.nextInt();
            String d = sc.next();

            if(d.equals("R")) {
                for(int j = 0; j < t; j++) {
                    indexA++;
                    moveA.add(indexA);
                }
            } else {
                for(int j = 0; j < t; j++) {
                    indexA--;
                    moveA.add(indexA);
                }
            }
        }

        for(int i = 0; i < m; i++) {
            int t = sc.nextInt();
            String d = sc.next();

            if(d.equals("R")) {
                for(int j = 0; j < t; j++) {
                    indexB++;
                    moveB.add(indexB);
                }
            } else {
                for(int j = 0; j < t; j++) {
                    indexB--;
                    moveB.add(indexB);
                }
            }
        }

        int cnt = 0;
        for(int i = 0; i < Math.max(moveA.size(), moveB.size()); i++) {
            if(i >= moveA.size()) {
                int valueA = moveA.get(moveA.size() - 1);
                if(valueA == moveB.get(i) && valueA != moveB.get(i - 1))
                    cnt++;
            } else if(i >= moveB.size()) {
                int valueB = moveB.get(moveB.size() - 1);
                if(valueB == moveA.get(i) && valueB != moveA.get(i - 1))
                    cnt++;
            } else {
                if(i != 0 && moveB.get(i) == moveA.get(i) && moveB.get(i - 1) != moveA.get(i - 1))
                    cnt++;
            }
        }

        System.out.println(cnt);
    }
}