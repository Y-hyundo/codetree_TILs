import java.util.*;

public class Main {
    public static final int MAX = 1000000;

    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] moveA = new int[MAX + 1];
        int[] moveB = new int[MAX + 1];
        int secondA = 0;
        int secondB = 0;
        int indexA = 0;
        int indexB = 0;

        for(int i = 0; i < n; i++) {
            String d = sc.next();
            int x = sc.nextInt();

            if(d.equals("R")) {
                for(int j = 0; j < x; j++) {
                    moveA[++secondA] = ++indexA;
                }
            } else {
                for(int j = 0; j < x; j++) {
                    moveA[++secondA] = --indexA;
                }
            }
        }

        for(int i = 0; i < m; i++) {
            String d = sc.next();
            int x = sc.nextInt();

            if(d.equals("R")) {
                for(int j = 0; j < x; j++) {
                    moveB[++secondB] = ++indexB;
                }
            } else {
                for(int j = 0; j < x; j++) {
                    moveB[++secondB] = --indexB;
                }
            }
        }

        for(int i = 1; i <= Math.max(secondA, secondB); i++) {
            if(moveA[i] == moveB[i]) {
                System.out.println(i);
                return;
            }
        }
    }
}