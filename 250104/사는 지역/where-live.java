import java.util.*;

class Info {
    String name;
    String addr;
    String city;

    public Info(String name, String addr, String city) {
        this.name = name;
        this.addr = addr;
        this.city = city;
    }
}
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Info[] info = new Info[n];

        for(int i = 0; i < n; i++)
            info[i] = new Info(sc.next(), sc.next(), sc.next());

        int latestIndex = 0;
        for(int i = 0; i < n; i++) {
            if(((info[latestIndex].name).compareTo(info[i].name)) < 0)
                latestIndex = i;
        }

        System.out.println("name " + info[latestIndex].name);
        System.out.println("addr " + info[latestIndex].addr);
        System.out.println("city " + info[latestIndex].city);
    }
}