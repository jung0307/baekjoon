import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int arr[] = new int[n];
        int total = 0;

        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            total = total + arr[i];
        }

        int avg = total / n;
        int answer = 0;

        for(int i = 0; i < n; i++) {
            if(arr[i] > avg) {
                answer = answer + arr[i] - avg;
            }
        }

        System.out.println(answer);
    }
}
