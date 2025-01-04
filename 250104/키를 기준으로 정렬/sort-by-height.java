import java.util.*;

class Physical implements Comparable<Physical> {
    String name;
    int height, weight;

    public Physical(String name, int height, int weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public int compareTo(Physical person) {
        return this.height - person.height;
    }
}
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Physical[] person = new Physical[n];

        for(int i = 0; i < n; i++)
            person[i] = new Physical(sc.next(), sc.nextInt(), sc.nextInt());

        Arrays.sort(person);

        for(int i = 0; i < n; i++) {
            System.out.printf("%s %d %d", person[i].name, person[i].height, person[i].weight);
            System.out.println();
        }
    }
}