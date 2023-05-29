
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().split(" ");

        int T = Integer.parseInt(s[0]);
        int S = Integer.parseInt(s[1]);

        if(S == 0) {
            if(T >= 12 && T <= 16) {
                System.out.println("320");
            }else {
                System.out.println("280");
            }
        }else {
            System.out.println("280");
        }
    }
}
