import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int start_hour = sc.nextInt();
        int start_min = sc.nextInt();
        int end_hour = sc.nextInt();
        int end_min = sc.nextInt();
        int elapsedTime = (end_hour * 60 + end_min) - (start_hour * 60 + start_min);

        System.out.println(elapsedTime);
    }
}