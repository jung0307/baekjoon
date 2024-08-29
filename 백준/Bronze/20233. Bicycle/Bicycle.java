import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int x = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int y = Integer.parseInt(br.readLine());
        int T = Integer.parseInt(br.readLine());

        int A = 0;
        int B = 0;

        if(30 < T) {
            A = a + ((T - 30) * x) * 21;
        }else {
            A = a;
        }

        if(45 < T) {
            B = b + ((T - 45) * y) * 21;
        }else {
            B = b;
        }

        System.out.println(A + " " + B);

    }
}
