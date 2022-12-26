
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String arr[] = br.readLine().split(" ");

        int n = Integer.parseInt(arr[0]);
        int k = Integer.parseInt(arr[1]);

        int arrInt[] = new int[n];
        arr = br.readLine().split(" ");

        for(int i = 0; i < arr.length; i++) {
            arrInt[i] = Integer.parseInt(arr[i]);
        }

        int maxInt[] = new int[n - k + 1];

        for(int i = 0; i < n - k + 1; i++) {

            int sum = 0;

            for(int j = i; j < i + k; j++) {
                sum = sum + arrInt[j];
            }

            maxInt[i] = sum;

        }
        int max = maxInt[0];
        for(int i = 0; i < maxInt.length; i++) {
            if(max < maxInt[i]) {
                max = maxInt[i];
            }
        }

        System.out.println(max);

    }
}
