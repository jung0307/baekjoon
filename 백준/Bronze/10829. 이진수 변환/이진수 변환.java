
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());

        StringBuilder sb = new StringBuilder();

        while (n != 0) {
            long a = n % 2;
            n = n / 2;
            sb.append(a);
        }

        System.out.print(sb.reverse().toString());



    }
}
