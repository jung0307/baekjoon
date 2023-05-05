
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s[] = br.readLine().split("/");
        int k = Integer.parseInt(s[0]);
        int d = Integer.parseInt(s[1]);
        int a = Integer.parseInt(s[2]);

        if(k + a < d || d == 0) {
            System.out.println("hasu");
        }else {
            System.out.println("gosu");
        }

    }
}
