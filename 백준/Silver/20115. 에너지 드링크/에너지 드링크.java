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
        double sum = 0;

        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(s[i]);
        }

        Arrays.sort(arr);

        sum = arr[n - 1];

        for(int i = n - 2; i >= 0; i--) {
            sum = sum + ((double) arr[i] / 2);
        }

        System.out.println(sum);
    }
}
