import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int cnt = 0;

        String s[] = br.readLine().split(" ");
        String a = br.readLine();

        for(int i = 0; i < n; i++) {
            if(s[i].equals(a)) {
                cnt++;
            }
        }

        System.out.println(cnt);

    }
}
