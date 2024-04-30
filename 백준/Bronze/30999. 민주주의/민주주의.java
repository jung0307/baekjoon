import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().split(" ");

        int N = Integer.parseInt(s[0]);
        int M = Integer.parseInt(s[1]);

        int cnt = 0;

        for(int i = 0; i < N; i++) {
            String ss[] = br.readLine().split("");
            int cnt_O = 0;

            for(int j = 0; j < ss.length; j++) {
                if(ss[j].equals("O")) {
                    cnt_O++;
                }
            }

            if(cnt_O > ss.length - cnt_O) {
                cnt++;
            }
        }

        System.out.println(cnt);

    }
}
