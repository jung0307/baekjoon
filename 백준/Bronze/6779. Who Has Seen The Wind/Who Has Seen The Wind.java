import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        // A = −6t 4 + ht 3 + 2t 2 + t

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int h = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        int answer = 0;

        for(int i = 1; i <= M; i++) {

            int A = -6 * (int)Math.pow(i , 4) + h * (int)Math.pow(i , 3) + 2 * (int)Math.pow(i , 2) + i;

            if(A <= 0) {
                answer = i;
                break;
            }

        }

        if(answer != 0) {
            System.out.println("The balloon first touches ground at hour: " + answer);
        }else {
            System.out.println("The balloon does not touch ground in the given time.");
        }

    }
}
