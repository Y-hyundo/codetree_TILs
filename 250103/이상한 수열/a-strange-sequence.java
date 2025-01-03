import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(strange_seq(n));
    }

    public static int strange_seq(int n) {
        if(n == 1)
            return 1;
        if(n == 2)
            return 2;

        return strange_seq(n / 3) + strange_seq(n - 1);
    }
}