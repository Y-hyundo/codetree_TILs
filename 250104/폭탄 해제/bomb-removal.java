import java.util.*;

class Bomb {
    String code;
    String lineColor;
    int second;

    public Bomb(String code, String lineColor, int second) {
        this.code = code;
        this.lineColor = lineColor;
        this.second = second;
    }
}
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        String code = sc.next();
        String color = sc.next();
        int second = sc.nextInt();

        Bomb bomb = new Bomb(code, color, second);
        System.out.println("code : " + bomb.code);
        System.out.println("color : " + bomb.lineColor);
        System.out.println("second : " + bomb.second);
    }
}