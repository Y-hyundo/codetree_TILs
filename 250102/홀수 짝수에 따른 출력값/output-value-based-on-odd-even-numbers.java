import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(sum_condition(n));
    }

    public static int sum_condition(int n) {
        if(n == 1)
            return 1;
        if(n == 2)
            return 2;

        return sum_condition(n - 2) + n;
    }
}