import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        String s[] = br.readLine().split(" ");
        int arr[] = new int[n];
        int cnt = 2;
        int ans = 0;

        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(s[i]);
        }

        Arrays.sort(arr);

        for(int i = n - 1; i >= 0; i--) {
            ans = Math.max(ans , cnt + arr[i]);
            cnt++;
        }

        System.out.println(ans);

    }
}
