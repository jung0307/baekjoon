import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().split(" ");

        int A = Integer.parseInt(s[0]);
        int P = Integer.parseInt(s[1]);
        int C = Integer.parseInt(s[2]);

        if(A + C > P) {
            System.out.println(A + C);
        }else {
            System.out.println(P);
        }
        
    }
}
