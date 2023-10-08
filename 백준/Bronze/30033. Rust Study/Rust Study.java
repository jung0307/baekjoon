import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        String s1[] = br.readLine().split(" ");
        String s2[] = br.readLine().split(" ");

        int cnt = 0;

        for(int i = 0; i < n; i++) {
            if(Integer.parseInt(s1[i]) <= Integer.parseInt(s2[i])) {
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}
