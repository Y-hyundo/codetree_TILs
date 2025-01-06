import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String[] days = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};

        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();

        int totalDays = ((m2 - m1) * 30) + (d2 - d1);
        if(totalDays < 0) {
            totalDays *= -1;
            totalDays %= 6;
            System.out.println(days[1 - totalDays]);
            return;
        }
        
        totalDays %= 6;
        System.out.println(days[1 + totalDays]);
    }
}