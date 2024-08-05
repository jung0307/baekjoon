import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int k = Integer.parseInt(br.readLine());

        if(n > k + 60) {
            System.out.println((k + 60) * 1500 + (n - k - 60) * 3000);
        }else {
            System.out.println(n * 1500);
        }

    }
}
