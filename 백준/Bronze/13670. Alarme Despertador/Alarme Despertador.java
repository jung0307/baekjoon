import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String ss = "";

        while ( !(ss = br.readLine()).equals("0 0 0 0") ) {
            String s[] = ss.split(" ");

            int h1 = Integer.parseInt(s[0]);
            int m1 = Integer.parseInt(s[1]);
            int h2 = Integer.parseInt(s[2]);
            int m2 = Integer.parseInt(s[3]);

            if(m1 > m2) {
                h2--;
                m2 = m2 + 60;
            }

            if(h2 == -1) {
                h2 = 23;
            }

            if(h1 > h2) {
                h2 = h2 + 24;
            }

            sb.append((h2 - h1) * 60 + (m2 - m1) + "\n");
        }

        System.out.print(sb.toString());

    }
}
