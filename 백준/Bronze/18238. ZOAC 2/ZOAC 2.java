import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().split("");

        int cidx = 0;
        int cidx2 = 0;
        int time = 0;

        String arr[] = new String[26];

        for(int i = 0; i < 26; i++) {
            arr[i] = Character.toString('A'+i);
        }

        for(int i = 0; i < s.length; i++) {

            int rtime = 0;
            int ltime = 0;

            while (!arr[cidx].equals(s[i])) {

                rtime++;
                if(cidx == 25) {
                    cidx = 0;
                }else {
                    cidx++;
                }

            }

            while (!arr[cidx2].equals(s[i])) {

                ltime++;
                if(cidx2 == 0) {
                    cidx2 = 25;
                }else {
                    cidx2--;
                }

            }

            if(rtime >= ltime) {
                time = time + ltime;
            }else {
                time = time + rtime;
            }

        }

        System.out.println(time);

    }
}
