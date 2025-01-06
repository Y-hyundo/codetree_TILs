import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();

        int elapsedDays = 1;

        while(true) {
            if(m1 == m2 && d1 == d2) {
                elapsedDays++;
                break;
            }
                
            
            elapsedDays++;
            d1++;
            
            if(d1 == getLastDay(m1)) {
                m1++;
                d1 = 1;
            }
        }

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