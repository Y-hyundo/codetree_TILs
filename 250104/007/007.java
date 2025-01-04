import java.util.*;

class Info {
    String secret_code;
    String meeting_point;
    int time;

    public Info(String secret_code, String meeting_point, int time) {
        this.secret_code = secret_code;
        this.meeting_point = meeting_point;
        this.time = time;
    }
}

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        String secret_code = sc.next();
        String meeting_point = sc.next();
        int time = sc.nextInt();

        Info info = new Info(secret_code, meeting_point, time);

        System.out.println("secret code : " + info.secret_code);
        System.out.println("meeting point : " + info.meeting_point);
        System.out.println("time : " + info.time);
    }
}