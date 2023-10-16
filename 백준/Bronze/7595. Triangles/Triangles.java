import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = "";

        while ( !(s = br.readLine()).equals("0") ) {
            int n = Integer.parseInt(s);

            star(n);

        }

        System.out.print(sb.toString());
    }

    public static void star(int n) {

        for(int i = 1; i <= n; i++) {

            for(int j = 0; j < i; j++) {
                sb.append("*");
            }
            sb.append("\n");

        }

    }

}
