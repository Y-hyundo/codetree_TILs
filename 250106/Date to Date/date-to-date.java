import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();

        int elapsedDays = 0;

        elapsedDays += getLastDay(m1) - d1 + 1;

        while(true) {
            m1++;
            if(m1 == m2)
                break;

            elapsedDays += getLastDay(m1);
        }

        elapsedDays += d2;
        System.out.println(elapsedDays);
    }

    public static int getLastDay(int m) {
        if(m == 2)
            return 28;

        if(m == 3 || m == 6 || m == 9 || m == 11)
            return 30;
        
        return 31;
    }
}