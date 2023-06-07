
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int cnt = 1;

        while (true) {
            if(n != 1) {
                if(n%2 == 0) {
                    n = n / 2;
                }else {
                    n = 3*n + 1;
                }
                cnt++;
            }else {
                break;
            }
        }

        System.out.println(cnt);



    }
}
