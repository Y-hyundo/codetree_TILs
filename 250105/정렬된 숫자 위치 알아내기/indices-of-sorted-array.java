import java.util.*;

class Sequence {
    int index;
    int value;

    public Sequence(int index, int value) {
        this.index = index;
        this.value = value;
    }
}

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Sequence[] seq = new Sequence[n];

        for(int i = 0; i < n; i++) {
            int index = i + 1;
            int value = sc.nextInt();

            seq[i] = new Sequence(index, value);
        }

        Arrays.sort(seq, (a, b) -> a.value - b.value);
        
        for(int i = 1; i <= n; i++) {
            for(int j = 0; j < n; j++) {
                if(seq[j].index == i) {
                    System.out.print((j + 1) + " ");
                    break;
                }
            }
        }
    }
}