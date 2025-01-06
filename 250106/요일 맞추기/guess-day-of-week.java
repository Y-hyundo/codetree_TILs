import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String[] days = new String[]{"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};

        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();

        int totalDays = 0;

        if(m2 == m1) {
            totalDays = d2 - d1;
        }
        else {
            while(true) {
                if(m1 == m2 && d1 == d2)
                    break;

                if(m2 < m1 || (m1 == m2 && d2 < d1)) {
                    d1--;
                    totalDays--;

                    if(d1 == 1) {
                        m1--;
                        d1 = getLastDay(m1);
                        totalDays--;
                    }
                }

                else {
                    d1++;
                    totalDays++;

                    if(d1 == getLastDay(m1)) {
                        m1++;
                        d1 = 1;
                        totalDays++;
                    }
                }
            }
        }
        if(totalDays < 0)
            totalDays %= -7;
        else
            totalDays %= 7;
        int today = (7 + totalDays) % 7;
        System.out.println(days[today]);
    }

    public static int getLastDay(int m) {
        if(m == 2)
            return 28;
        
        if(m == 4 || m == 6 || m == 9 || m == 11)
            return 30;

        return 31;
    }
}

//해설 코드
// import java.util.Scanner;

// public class Main {
//     public static int numOfDays(int m, int d) {
//         // 계산 편의를 위해 월마다 몇 일이 있는지를 적어줍니다. 
//         int[] days = new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
//         int totalDays = 0;
        
//         // 1월부터 (m - 1)월 까지는 전부 꽉 채워져 있습니다.
//         for(int i = 1; i < m; i++)
//             totalDays += days[i];
        
//         // m월의 경우에는 정확이 d일만 있습니다.
//         totalDays += d;
        
//         return totalDays;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         // 변수 선언 및 입력
//         int m1 = sc.nextInt();
//         int d1 = sc.nextInt();
//         int m2 = sc.nextInt();
//         int d2 = sc.nextInt();
        
//         // 두 날짜간의 차이가 몇 일인지를 구합니다.
//         int diff = numOfDays(m2, d2) - numOfDays(m1, d1);
        
//         // 음수인 경우에는, 양수로 넘겨 계산해주면 올바르게 계산이 됩니다. 
//         while(diff < 0)
//             diff += 7;
        
//         // 알맞은 요일의 이름을 출력합니다.
//         String[] dayOfWeek = new String[]{"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
//         System.out.print(dayOfWeek[diff % 7]);
//     }
// }