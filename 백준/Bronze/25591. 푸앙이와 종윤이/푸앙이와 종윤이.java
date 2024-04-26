import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().split(" ");

        int num1 = Integer.parseInt(s[0]);
        int num2 = Integer.parseInt(s[1]);

        int a = 100 - num1;
        int b = 100 - num2;
        int c = 100 - (a + b);
        int d = a * b;
        int q = d / 100;
        int r = d % 100;

        System.out.println(a + " " + b + " " + c + " " + d + " " + q + " " + r);
        System.out.println((c + q) + " " + r);

    }
}
