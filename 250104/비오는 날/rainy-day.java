import java.util.*;
import java.time.*;

class Weather {
    String date;
    String day;
    String weather;

    public Weather(String date, String day, String weather) {
        this.date = date;
        this.day = day;
        this.weather = weather;
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

        String[] currentDateStr = (LocalDate.now().toString()).split("-");
        int currentDate = Integer.parseInt(String.join("",currentDateStr));
        int before_gap = currentDate;
        int closest = 0;

        for(int i = 0; i < n; i++) {
            if((data[i].weather).equals("Rain")) {
                String[] date = (data[i].date).split("-");
                int Date = Integer.parseInt(String.join("", date));
                int new_gap = currentDate - Date;
                if(new_gap < 0)
                    new_gap *= -1;

                if(new_gap < before_gap)
                    closest = i;
                
                before_gap = new_gap;
            }
        }

        System.out.println(data[closest].date + " " + data[closest].day + " " + data[closest].weather);
    }
}