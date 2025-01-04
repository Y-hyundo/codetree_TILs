import java.util.*;

class Weather {
    String date;
    String day;
    String weather;

    public Weather(String date, String day, String weather) {
        this.date = date;
        this.day = day;
        this.weather = weather;
    }

    public int getDate() {
        String[] split_date = date.split("-");
        return Integer.parseInt(String.join("", split_date));
    }
}
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Weather[] data = new Weather[n];

        for(int i = 0; i < n; i++)
            data[i] = new Weather(sc.next(), sc.next(), sc.next());

        int closest = 0;
        Arrays.sort(data, (o1, o2) -> {
            return Integer.compare(o1.getDate(), o2.getDate());
        });
        for(int i = 0; i < n; i++) {
            if(data[i].weather.equals("Rain")) {
                closest = i;
                break;
            }
        }

        System.out.println(data[closest].date + " " + data[closest].day + " " + data[closest].weather);
    }
}