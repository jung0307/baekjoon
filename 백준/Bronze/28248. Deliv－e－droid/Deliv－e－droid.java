import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int G = Integer.parseInt(br.readLine());
        int L = Integer.parseInt(br.readLine());
        int sum = 50 * G - (10 * L);

        if(G > L) {
            sum = sum + 500;
        }

        System.out.println(sum);

    }
}
