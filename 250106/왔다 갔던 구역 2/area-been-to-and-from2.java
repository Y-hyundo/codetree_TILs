import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[101];
        int index = 50;

        for(int i = 0; i < n; i++) {
            int distance = sc.nextInt();
            String direction = sc.next();

            if(direction.equals("R")) {
                for(int j = 0; j < distance; j++) {
                    arr[index]++;
                    index++;
                }
            }
            else if(direction.equals("L")) {
                for(int j = 0; j < distance; j++) {
                    index -= 1;
                    arr[index]++;
                }
            }
        }

        int cnt = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] >= 2)
                cnt++;
        }

        System.out.println(cnt);
    }
}