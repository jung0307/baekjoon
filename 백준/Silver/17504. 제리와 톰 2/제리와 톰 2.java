import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String s[] = br.readLine().split(" ");

        int i = n - 1;
        long a = Integer.parseInt(s[i - 1]) * Integer.parseInt(s[i]) + 1;
        long b = Integer.parseInt(s[i]);

        i--;

        while (i != 0) {
            i--;
            long temp = a;
            a = b;
            b = temp;

            a = Integer.parseInt(s[i]) * b + a;

        }

        System.out.println(a - b + " " + a);


    }


}
