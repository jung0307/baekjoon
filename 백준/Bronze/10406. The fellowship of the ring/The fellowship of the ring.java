import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s1[] = br.readLine().split(" ");
        String s2[] = br.readLine().split(" ");

        int cnt = 0;

        for(int i = 0; i < Integer.parseInt(s1[2]); i++) {

            if(Integer.parseInt(s2[i]) >= Integer.parseInt(s1[0]) && Integer.parseInt(s2[i]) <= Integer.parseInt(s1[1])) {
                cnt++;
            }

        }

        System.out.println(cnt);

    }
}
