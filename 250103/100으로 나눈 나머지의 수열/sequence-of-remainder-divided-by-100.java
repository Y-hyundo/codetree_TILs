import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(find_value(n));
    }

    public static int find_value(int n) {
        if(n == 1)
            return 2;
        if(n == 2)
            return 4;
        
        return (find_value(n - 1) * find_value(n - 2)) % 100;
    }
}