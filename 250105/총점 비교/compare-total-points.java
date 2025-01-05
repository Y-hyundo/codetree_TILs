import java.util.*;

class Student implements Comparable<Student> {
    String name;
    int kor, eng, math;

    public Student(String name, int kor, int eng, int math) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    @Override
    public int compareTo(Student student) {
        int this_sum = this.kor + this.eng + this.math;
        int compare_sum = student.kor + student.eng + student.math;
        return this_sum - compare_sum;
    }
}
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Student[] students = new Student[n];

        for(int i = 0; i < n; i++)
            students[i] = new Student(sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt());

        Arrays.sort(students);

        for(int i = 0; i < n; i++)
            System.out.printf("%s %d %d %d\n", students[i].name, students[i].kor, students[i].eng, students[i].math);
    }
}