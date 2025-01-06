import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String[] days = new String[]{"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};

        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();

        int totalDays = 0;

        if(m2 == m1) {
            totalDays = d2 - d1;
        }
        else {
            while(true) {
                if(m1 == m2 && d1 == d2)
                    break;

                if(m2 < m1) {
                    d1--;
                    totalDays--;

                    if(d1 == 0) {
                        m1--;
                        d1 = getLastDay(m1);
                        totalDays--;
                    }
                }

                else {
                    d1++;
                    totalDays++;

                    if(d1 == getLastDay(m1)) {
                        m1++;
                        d1 = 1;
                        totalDays++;
                    }
                }
            }
        }
        
        int today = (7 + totalDays) % 7;
        System.out.println(days[today]);
    }

    public static int getLastDay(int m) {
        if(m == 2)
            return 28;
        
        if(m == 4 || m == 6 || m == 9 || m == 11)
            return 30;

        return 31;
    }
}