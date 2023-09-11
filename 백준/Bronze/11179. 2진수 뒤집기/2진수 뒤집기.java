import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        while ( n > 0 ) {
            sb.append(n % 2);
            n = n / 2;
        }

        String s[] = sb.reverse().toString().split("");
        int m = 0;

        for(int i = 0; i < s.length; i++) {
            m = m + Integer.parseInt(s[i]) * (int)Math.pow(2 , i);

        }

        System.out.println(m);
    }
}
