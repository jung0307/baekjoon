import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s[] = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);

        if(m == 1 || m == 2) {
            System.out.println("NEWBIE!");
        } else if (m <= n) {
            System.out.println("OLDBIE!");
        }else {
            System.out.println("TLE!");
        }


    }
}
