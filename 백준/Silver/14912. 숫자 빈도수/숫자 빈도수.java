import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s[] = br.readLine().split(" ");

        int a = Integer.parseInt(s[0]);

        int cnt = 0;

        for(int i = 1; i <= a; i++ ) {
            String ss[] = (i + "").split("");

            for(int j =0; j < ss.length; j++) {
                if(ss[j].equals(s[1])) {
                    cnt++;
                }
            }
        }

        System.out.println(cnt);

    }
}
