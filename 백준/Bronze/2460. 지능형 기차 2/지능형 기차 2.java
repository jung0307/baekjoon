import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int man = 0;
        int max = 0;

        for(int i = 0; i < 10; i++) {
            String s[] = br.readLine().split(" ");

            int man_gotOff_Bus = Integer.parseInt(s[0]);
            int man_takeA_Bus = Integer.parseInt(s[1]);

            man = man + man_takeA_Bus - man_gotOff_Bus;

            if(man >= max) {
                max = man;
            }
        }

        System.out.println(max);

    }
}
