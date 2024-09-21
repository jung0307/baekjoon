import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int arr[] = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int m = Integer.parseInt(br.readLine());
        int sum = 0;

        for(int i = 0; i < m; i++) {
            int a = Integer.parseInt(br.readLine());

            sum = sum + arr[a - 1];
        }

        System.out.println(sum);

    }
}
