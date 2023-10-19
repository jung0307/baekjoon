import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int cnt = 0;

        while (s.length() != 1) {
            String ss[] = s.split("");
            int t = 1;

            for(int i = 0; i < ss.length; i++) {
                t = t * Integer.parseInt(ss[i]);
            }

            s = Integer.toString(t);
            cnt++;
        }

        System.out.println(cnt);


    }
}
