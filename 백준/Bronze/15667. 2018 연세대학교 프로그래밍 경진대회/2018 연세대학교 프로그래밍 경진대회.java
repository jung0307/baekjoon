import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        int i = 0;
        while (true) {
            if (num == (1 + i + i * i)) {
                break;
            }
            i++;
            if (i > 10101) {
                break;
            }
        }
        System.out.println(i);
        br.close();
    }

}
