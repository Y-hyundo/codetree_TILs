import java.util.*;

class Student {
    int height, weight, seq;

    public Student(int height, int weight, int seq) {
        this.height = height;
        this.weight = weight;
        this.seq = seq;
    }
}

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Student[] students = new Student[n];
        for(int i = 0; i < n; i++) {
            int height = sc.nextInt();
            int weight = sc.nextInt();
            int seq = i + 1;

            students[i] = new Student(height, weight, seq);
        }

        Arrays.sort(students, (a, b) -> {
            if(a.height == b.height) {
                return b.weight - a.weight;
            }

            return a.height - b.height;
        });

        for(int i = 0; i < n; i++)
            System.out.printf("%d %d %d\n", students[i].height, students[i].weight, students[i].seq);
    }
}