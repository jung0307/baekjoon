import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        while (n > 0) {
            int a = n / 2;
            int b = n % 2;

            n = a;

            sb.append(b);
        }

        String a = sb.reverse().toString();
        String b = "";

        for(int i = 0; i < a.length(); i++) {

            if(a.charAt( a.length() - 1 - i ) == '1') {
                b = b + (i + "") + " ";
            }

        }

        System.out.println(b);

    }
}
