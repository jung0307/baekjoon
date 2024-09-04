import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int S = Integer.parseInt(br.readLine());
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());

        int cost = 0;

        if(S <= A) {
            cost = 250;
        }else {
            int i = 0;
            while (S > A + B * i) {
                i++;
            }

            cost = 250 + 100 * i;
        }

        System.out.println(cost);

    }
}
