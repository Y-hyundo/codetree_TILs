import java.util.*;

class Person {
    String name;
    int height;
    double weight;

    public Person(String name, int height, double weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }
}

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        Person[] person = new Person[5];
        for(int i = 0; i < person.length; i++) {
            String name = sc.next();
            int height = sc.nextInt();
            double weight = sc.nextDouble();
            person[i] = new Person(name, height, weight);
        }

        Arrays.sort(person, new Comparator<Person>() {
            @Override
            public int compare(Person a, Person b) {
                return (a.name).compareTo(b.name);
            }
        });

        System.out.println("name");
        for(int i = 0; i < person.length; i++)
            System.out.printf("%s %d %.1f\n", person[i].name, person[i].height, person[i].weight);
            
        System.out.println();
        Arrays.sort(person, (a, b) -> b.height - a.height);

        System.out.println("height");
        for(int i = 0; i < person.length; i++)
            System.out.printf("%s %d %.1f\n", person[i].name, person[i].height, person[i].weight);
    }
}