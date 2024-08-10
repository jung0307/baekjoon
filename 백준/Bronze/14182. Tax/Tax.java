import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String s = "";

        while ( !(s = br.readLine()).equals("0") ) {
            int n = Integer.parseInt(s);

            if(n > 5000000) {
                sb.append((int)(n * 0.8) + "\n");
            } else if (n > 1000000) {
                sb.append((int)(n * 0.9) + "\n");
            }else {
                sb.append(n + "\n");
            }
        }

        System.out.print(sb.toString());

    }
}
