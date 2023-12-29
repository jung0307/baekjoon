import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().split(" ");

        double a = Double.parseDouble(s[0]) / Integer.parseInt(s[1]);

        if(a < 0.2) {
            System.out.println("weak");
        } else if (a < 0.4) {
            System.out.println("normal");
        } else if (a < 0.6) {
            System.out.println("strong");
        }else {
            System.out.println("very strong");
        }

    }
}
