import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        long c = 1;
        long a = 7*24*60*60;

        for(long i = 1; i <= n; i++) {
            c = c * i;
        }

        System.out.println(c/a);

    }
}
