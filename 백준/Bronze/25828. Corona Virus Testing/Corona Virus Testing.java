import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().split(" ");

        int g = Integer.parseInt(s[0]);
        int p = Integer.parseInt(s[1]);
        int t = Integer.parseInt(s[2]);
        
        if(g * p == t * p + g) {
            System.out.println("0");
        } else if (g * p < t * p + g) {
            System.out.println("1");
        } else if (g * p > t * p + g) {
            System.out.println("2");
        }

    }
}
