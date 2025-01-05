import java.util.*;

class Student implements Comparable<Student> {
    int seq, height, weight;

    public Student(int seq, int height, int weight) {
        this.seq = seq;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public int compareTo(Student student) {
        if(this.height == student.height) {
            if(this.weight == student.weight)
                return this.seq - student.seq;
            
            return student.weight - this.weight;
        }
        
        return student.height - this.height;
    }
}
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Student[] students = new Student[n];

        for(int i = 0; i < n; i++) {
            int seq = i + 1;
            int height = sc.nextInt();
            int weight = sc.nextInt();
            students[i] = new Student(seq, height, weight);
        }

        Arrays.sort(students);

        for(int i = 0; i < n; i++)
            System.out.printf("%d %d %d\n", students[i].height, students[i].weight, students[i].seq);
        
    }
}