import java.util.*;

class UserInfo {
    String user;
    int lv;

    public UserInfo(String user, int lv) {
        this.user = user;
        this.lv = lv;
    }
}

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        UserInfo user1 = new UserInfo("codetree", 10);
        System.out.println("user " + user1.user + " lv " + user1.lv);

        String user = sc.next();
        int lv = sc.nextInt();

        user1.user = user;
        user1.lv = lv;
        System.out.println("user " + user1.user + " lv " + user1.lv);
    }
}