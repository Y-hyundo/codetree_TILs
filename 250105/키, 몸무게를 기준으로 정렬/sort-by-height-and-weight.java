import java.util.*;

class Person {
    String name;
    int height, weight;

    public Person(String name, int height, int weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }
}

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Person[] person = new Person[n];

        for(int i = 0; i < n; i++) {
            String name = sc.next();
            int height = sc.nextInt();
            int weight = sc.nextInt();
            person[i] = new Person(name, height, weight);
        }

        Arrays.sort(person, (a, b) -> {
            if(a.height == b.height)
                return b.weight - a.weight;

            return a.height - b.height;
        });

        for(int i = 0; i < n; i++)
            System.out.printf("%s %d %d\n", person[i].name, person[i].height, person[i].weight);
    }
}