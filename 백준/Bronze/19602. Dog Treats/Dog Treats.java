import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int S = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        int L = Integer.parseInt(br.readLine());

//        1 × S + 2 × M + 3 × L

        int sum = (1 * S) + (2 * M) + (3 * L);

        if(sum >= 10) {
            System.out.println("happy");
        }else {
            System.out.println("sad");
        }

    }
}
