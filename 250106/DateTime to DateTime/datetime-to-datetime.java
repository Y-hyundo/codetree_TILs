import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int day = sc.nextInt();
        int hour = sc.nextInt();
        int min = sc.nextInt();

        int totalTime = ((day - 11) * 24 * 60) + ((hour - 11) * 60) + (min - 11);
        if(totalTime < 0) {
            System.out.println(-1);
            return;
        }
        System.out.println(totalTime);
    }
}