import java.util.*;

public class Main {
    public static final int OFFSET = 100000;
    public static final int MAX_R = 200000;
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        
        int index = OFFSET;
        int n = sc.nextInt();
        String[] color = new String[MAX_R + 1];

        for(int i = 0; i <= MAX_R; i++)
            color[i] = "grey";

        for(int i = 0; i < n; i++) {
            int x = sc.nextInt() + OFFSET;
            String d = sc.next();

            for(int j = OFFSET; j < x; j++) {
                if(d.equals("R")) {
                    color[index] = "black";
                    if(j == x - 1)
                        break;
                    index++;
                } else {
                    color[index] = "white";
                    if(j == x - 1)
                        break;
                    index--;
                }
            }
        }

        int white = 0;
        int black = 0;

        for(int i = 0; i < MAX_R; i++) {
            if(color[i].equals("black"))
                black++;
            
            if(color[i].equals("white"))
                white++;
        }
        System.out.println(white + " " + black);
    }
}