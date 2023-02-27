import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());

        long sum = 0;
        long maxNum = 1;

        while (true) {

            sum = sum + maxNum;

            if(sum > n) {
                maxNum = maxNum - 1;
                break;
            }

            maxNum = maxNum + 1;
        }

        System.out.println(maxNum);

    }
}
