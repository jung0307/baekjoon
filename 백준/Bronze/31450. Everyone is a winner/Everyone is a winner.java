import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().split(" ");
        int M = Integer.parseInt(s[0]);
        int K = Integer.parseInt(s[1]);

        if(M % K == 0) {
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }

    }
}
