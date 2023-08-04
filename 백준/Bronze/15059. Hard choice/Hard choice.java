import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s1[] = br.readLine().split(" ");
        String s2[] = br.readLine().split(" ");

        int a = Integer.parseInt(s2[0]) - Integer.parseInt(s1[0]);
        int b = Integer.parseInt(s2[1]) - Integer.parseInt(s1[1]);
        int c = Integer.parseInt(s2[2]) - Integer.parseInt(s1[2]);

        int sum = 0;

        if(a >= 0) {
            sum = sum + a;
        }
        if(b >= 0) {
            sum = sum + b;
        }
        if(c >= 0) {
            sum = sum + c;
        }

        System.out.println(sum);

    }
}
