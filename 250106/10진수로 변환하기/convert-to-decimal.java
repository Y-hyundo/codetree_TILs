import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int index = 0;
        int num = 0;
        int digit = 0;

        while(true) {
            int square = 1;

            if(n < 10) {
                for(int i = 0; i < index; i++)
                    square *= 2;
                
                digit = n % 10;
                num += digit * square;
                break;
            }

            digit = n % 10;
            n /= 10;
            
            for(int i = 0; i < index; i++)
                square *= 2;

            num += digit * square;
            index++;
        }
        System.out.println(num);
    }
}