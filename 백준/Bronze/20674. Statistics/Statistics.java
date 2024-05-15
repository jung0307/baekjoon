import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int arr[] = new int[n];
        int sum = 0;

        for(int i = 0; i < n; i++) {
            int a = Integer.parseInt(br.readLine());
            arr[i] = a;
        }

        for(int i = 1; i < n; i++) {
            if(arr[i - 1] < arr[i]) {
                sum = sum + (arr[i] - arr[i - 1]);
                arr[i] = arr[i - 1];
            }
        }

        System.out.println(sum);

    }
}
