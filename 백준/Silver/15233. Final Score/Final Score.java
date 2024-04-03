import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main{

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s1[] = br.readLine().split(" ");
        String playerA[] = br.readLine().split(" ");
        String playerB[] = br.readLine().split(" ");
        String goal[] = br.readLine().split(" ");

        int a = Integer.parseInt(s1[0]);
        int b = Integer.parseInt(s1[1]);
        int g = Integer.parseInt(s1[2]);

        int aGoal = 0;
        int bGoal = 0;

        HashMap<String , String> map = new HashMap<>();

        for(int i = 0; i < a; i++) {
            map.put(playerA[i] , "A");
        }

        for(int i = 0; i < b; i++) {
            map.put(playerB[i] , "B");
        }

            for(int i = 0; i < g; i++) {
                if(map.get(goal[i]).equals("A")) {
                    aGoal++;
                }else {
                    bGoal++;
                }
            }

        if(aGoal > bGoal) {
            System.out.println("A");
        } else if (aGoal < bGoal) {
            System.out.println("B");
        }else {
            System.out.println("TIE");
        }
        
    }
}
