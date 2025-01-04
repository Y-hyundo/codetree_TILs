import java.util.*;

class Agent {
    String codename;
    int score;

    public Agent(String codename, int score) {
        this.codename = codename;
        this.score = score;
    }
}

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        Agent[] agents = new Agent[5];
        for(int i = 0; i < agents.length; i++)
            agents[i] = new Agent(sc.next(), sc.nextInt());

        int min = 100;
        int minIndex = -1;
        for(int i = 0; i < agents.length; i++) {
            if(agents[i].score < min) {
                min = agents[i].score;
                minIndex = i;
            }
        }

        System.out.println(agents[minIndex].codename + " " + agents[minIndex].score);
    }
}