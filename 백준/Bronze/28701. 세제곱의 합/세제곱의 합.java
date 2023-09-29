import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;

        for(int i = 1; i <= n; i++) {
            sum1 = sum1 + i;
        }

        sum2 = (int)Math.pow(sum1 , 2);

        for(int i = 1; i <= n; i++) {
            sum3 = sum3 + (int)Math.pow(i , 3);
        }

        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum3);

    }
}
