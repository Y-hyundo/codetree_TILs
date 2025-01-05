import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int start_hour = sc.nextInt();
        int start_min = sc.nextInt();
        int end_hour = sc.nextInt();
        int end_min = sc.nextInt();
        int elapsedTime = 0;

        while(start_hour != end_hour || start_min != end_min) {
            elapsedTime++;
            start_min++;

            if(start_min == 60) {
                start_hour++;
                start_min = 0;
            }
        }

        System.out.println(elapsedTime);
    }
}