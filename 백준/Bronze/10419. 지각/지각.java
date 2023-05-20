
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < n; i++) {
            int a = Integer.parseInt(br.readLine());

            int b = 0;

            while ( (b+1)*(b+1) + (b+1) <= a) {
                b++;
            }

            sb.append(b+"\n");
        }

        System.out.print(sb.toString());

    }
}
