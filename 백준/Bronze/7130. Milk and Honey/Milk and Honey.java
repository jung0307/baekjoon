import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().split(" ");

        int cowE = Integer.parseInt(s[0]);
        int beeE = Integer.parseInt(s[1]);

        int n = Integer.parseInt(br.readLine());

        int best = 0;

        for(int i = 0; i < n; i++) {
            String ss[] = br.readLine().split(" ");

            int cow = Integer.parseInt(ss[0]);
            int bee = Integer.parseInt(ss[1]);

            if(cowE * cow >= beeE * bee) {
                best = best + cowE * cow;
            }else {
                best = best + beeE * bee;
            }
        }

        System.out.println(best);

    }
}
