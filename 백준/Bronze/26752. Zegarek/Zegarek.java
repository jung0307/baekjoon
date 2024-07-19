import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().split(" ");

        int h = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);
        int se = Integer.parseInt(s[2]);

        String h2 = "";
        String m2 = "";
        String se2 = "";

        if(se == 59) {
            se = 00;
            m = m + 1;
        }else {
            se++;
        }

        if(m == 60) {
            m = 00;
            h = h + 1;
        }

        if(h == 24) {
            h = 00;
        }

        System.out.println(String.format("%02d" , h) + ":" + String.format("%02d" , m) + ":" + String.format("%02d" , se));

    }
}