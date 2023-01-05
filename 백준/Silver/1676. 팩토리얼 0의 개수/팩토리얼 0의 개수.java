import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int b = 0;

        for(int i = 1; i <= n; i++) {
            int c = i;
            while (c%2 == 0 || c%5 == 0) {
                if(c%2 == 0) {
                    c = c/2;
                }else if(c%5 == 0) {
                    c = c/5;
                    b++;
                }
            }
        }

        System.out.println(b);
    }
}
