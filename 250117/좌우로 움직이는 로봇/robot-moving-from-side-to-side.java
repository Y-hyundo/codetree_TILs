import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        ArrayList<Integer> moveA = new ArrayList<>();
        ArrayList<Integer> moveB = new ArrayList<>();

        int indexA = 0;
        int indexB = 0;

        moveA.add(0);
        moveB.add(0);

        // A의 이동 기록
        for (int i = 0; i < n; i++) {
            int t = sc.nextInt();
            String d = sc.next();

            int direction = d.equals("R") ? 1 : -1;
            for (int j = 0; j < t; j++) {
                indexA += direction;
                moveA.add(indexA);
            }
        }

        // B의 이동 기록
        for (int i = 0; i < m; i++) {
            int t = sc.nextInt();
            String d = sc.next();

            int direction = d.equals("R") ? 1 : -1;
            for (int j = 0; j < t; j++) {
                indexB += direction;
                moveB.add(indexB);
            }
        }

        int cnt = 0;
        int maxTime = Math.max(moveA.size(), moveB.size());

        // 마지막 위치를 유지하도록 설정
        int lastA = moveA.get(moveA.size() - 1);
        int lastB = moveB.get(moveB.size() - 1);

        for (int i = 1; i < maxTime; i++) {
            int posA = i < moveA.size() ? moveA.get(i) : lastA;
            int posB = i < moveB.size() ? moveB.get(i) : lastB;

            int prevA = i - 1 < moveA.size() ? moveA.get(i - 1) : lastA;
            int prevB = i - 1 < moveB.size() ? moveB.get(i - 1) : lastB;

            if (posA == posB && prevA != prevB) {
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}
