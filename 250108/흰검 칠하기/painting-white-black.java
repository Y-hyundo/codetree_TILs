import java.util.*;

public class Main {
    public static final int MAX_R = 200000;
    public static final int OFFSET = 100000;

    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int index = OFFSET;

        String[] color = new String[MAX_R + 1];
        int[] white_count = new int[MAX_R + 1];
        int[] black_count = new int[MAX_R + 1];

        for(int i = 0; i < n; i++) {
            int x = sc.nextInt() + OFFSET;
            String d = sc.next();

            if(d.equals("R")) {
                for(int j = OFFSET; j < x; j++) {
                    color[index] = "black";
                    black_count[index]++;
                    if(white_count[index] >= 2 && black_count[index] >= 2) {
                        color[index] = "grey";
                    }
                    if(j == x - 1)
                        break;
                    index++;
                }
            }
            else {
                for(int k = OFFSET; k < x; k++) {
                    color[index] = "white";
                    white_count[index]++;
                    if(white_count[index] >= 2 && black_count[index] >= 2) {
                        color[index] = "grey";
                    }    
                    if(k == x - 1)
                        break;                    
                    index--;
                }
            }
        }

        int black = 0;
        int white = 0;
        int grey = 0;

        for(int i = 0; i <= MAX_R; i++) {
            if(color[i] == null)
                continue;
            
            if(color[i].equals("black"))
                black++;

            if(color[i].equals("white"))
                white++;

            if(color[i].equals("grey"))
                grey++;
        }

        System.out.println(white + " " + black + " " + grey);
    }
}