import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int cnt = 2;
        String[] arr = new String[n];

        for(int i = 0; i < n; i++) {
            arr[i] = br.readLine();
        }

        for(int i = 0; i < n - 1; i++) {

            if(!arr[i].equals(arr[i + 1])) {
                cnt++;
            }

        }

        System.out.println(cnt);

    }
}
