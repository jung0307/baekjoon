import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        String arr_n[] = new String[n];
        String arr_m[] = new String[m];

        for(int i = 0; i < n; i++) {
            arr_n[i] = br.readLine();
        }

        for(int i = 0; i < m; i++) {
            arr_m[i] = br.readLine();
        }

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                sb.append(arr_n[i] + " as " + arr_m[j] + "\n");
            }
        }

        System.out.print(sb.toString());


    }
}
