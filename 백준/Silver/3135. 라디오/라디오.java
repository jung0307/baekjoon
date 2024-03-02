import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s1[] = br.readLine().split(" ");

        int A = Integer.parseInt(s1[0]);
        int B = Integer.parseInt(s1[1]);

        int n = Integer.parseInt(br.readLine());
        int arr[] = new int[n + 1];

        for(int i = 0; i < n; i++) {
            int l = Integer.parseInt(br.readLine());
            arr[i] = Math.abs(l - B) + 1;
        }

        arr[n] = Math.abs(A - B);

        Arrays.sort(arr);

        System.out.println(arr[0]);

    }
}
