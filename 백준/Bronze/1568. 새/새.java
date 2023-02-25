
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int k = 1;
        int sum = 0;

        while (true) {
            
            if(n == 0) {
                break;
            }

            if (k <= n) {
                n = n - k;
                sum++;
                k++;
            }else {
                k = 1;
                n = n - k;
                k++;
                sum++;
            }
        }

        System.out.println(sum);

    }
}
