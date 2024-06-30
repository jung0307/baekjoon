import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().split(" ");

        int n = Integer.parseInt(s[0]);
        int k = Integer.parseInt(s[1]);
        int a = Integer.parseInt(s[2]);
        int b = Integer.parseInt(s[3]);

        int A = (n - 1) * a;
        int B = ((k - 1) + (n - 1)) * b;

        System.out.println(B + " " + A);

    }
}
