import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[sc.nextInt()];
        for(int i = 0; i < arr.length; i++)
            arr[i] = sc.nextInt();
        
        Arrays.sort(arr);
        for(int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");

        System.out.println();

        Integer[] arr2 = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        Arrays.sort(arr2, Collections.reverseOrder());
        for(int i = 0; i < arr.length; i++)
            System.out.print(arr2[i] + " ");

    }
}