import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        String start = sc.next();

        String[] wordArr = new String[n];
        for(int i = 0; i < n; i++)
            wordArr[i] = sc.next();
    
        Arrays.sort(wordArr);    

        ArrayList<String> list = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            if(wordArr[i].startsWith(start)) {
                list.add(wordArr[i]);
            }
        }

        System.out.println(list.get(k - 1));
    }
}