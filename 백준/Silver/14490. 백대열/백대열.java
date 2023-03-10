
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().split(":");

        int a = Integer.parseInt(s[0]);
        int b = Integer.parseInt(s[1]);

        int c = 2;

        while (true) {
            if(a%c == 0 && b%c == 0) {

                a = a/c;
                b = b/c;
                c = 2;

            }else {
                c++;
            }

            if(c > b || c > a) {
                break;
            }
        }

        System.out.println(a + ":" + b);

    }
}
