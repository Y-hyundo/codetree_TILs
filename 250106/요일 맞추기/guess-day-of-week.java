import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String[] days = new String[]{"Mon", "The", "Wed", "Thu", "Fri", "Sat", "Sun"};

        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();

        int totalDays = ((m2 - m1) * 30) + (d2 - d1);
        int today = (7 + totalDays) % 7;
        System.out.println(days[today]);
    }
}