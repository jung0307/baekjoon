import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        String s[] = br.readLine().split(" ");
        int cnt = 0;

        for(int i = 0; i < n; i++) {
            if(s[i].equals("he") || s[i].equals("she") || s[i].equals("him") || s[i].equals("her")) {
                cnt++;
            }
        }

        System.out.println(cnt);

    }
}
