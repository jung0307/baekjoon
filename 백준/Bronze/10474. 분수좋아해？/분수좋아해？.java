import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String s = "";

        while ( !(s = br.readLine()).equals("0 0") ) {
            String ss[] = s.split(" ");

            int a = Integer.parseInt(ss[0]);
            int b = Integer.parseInt(ss[1]);
            int c = a / b;
            int d = a % b;

            sb.append(c + " " + d + " / " + b + "\n");

        }

        System.out.print(sb.toString());

    }
}
