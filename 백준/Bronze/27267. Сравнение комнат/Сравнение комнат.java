import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().split(" ");

        int a = Integer.parseInt(s[0]);
        int b = Integer.parseInt(s[1]);
        int c = Integer.parseInt(s[2]);
        int d = Integer.parseInt(s[3]);

        if(a * b > c * d) {
            System.out.println("M");
        } else if (a * b == c * d) {
            System.out.println("E");
        }else {
            System.out.println("P");
        }

    }
}
