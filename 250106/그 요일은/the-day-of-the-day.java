import java.util.*;

public class Main {
    public static int numOfDays(int m, int d) {
        int[] lastDay = new int[]{0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int totalDays = 0;
        for(int i = 1; i < m; i++)
            totalDays += lastDay[i];

        totalDays += d;

        return totalDays;
    }

    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String[] days = new String[]{"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};

        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        String day = sc.next();

        int totalDays = numOfDays(m2, d2) - numOfDays(m1, d1);
        int count = 0;

        while(totalDays > 0) {
            int index = totalDays % 7;
            if(days[index].equals(day))
                count++;
            
            totalDays--;
        }

        System.out.println(count);
    }
}