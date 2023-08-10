import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < n; i++) {
            int m = Integer.parseInt(br.readLine());

            if(m % 2 == 0) {
                sb.append(m + " is even\n");
            }else {
                sb.append(m + " is odd\n");
            }

        }

        System.out.print(sb.toString());



    }
}
