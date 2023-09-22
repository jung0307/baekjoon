import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s1[] = br.readLine().split(" ");
        String s2[] = br.readLine().split(" ");

        int cnt = 0;

        for(int i = 0; i < 4; i++) {
            if(s2[0].equals(s1[i])) {
                cnt = i + 1;
            }
        }

        System.out.println(cnt);

    }
}
