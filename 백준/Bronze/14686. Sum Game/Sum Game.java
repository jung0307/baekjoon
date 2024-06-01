import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int k = 0;

        int sum1 = 0;
        int sum2 = 0;

        String s1[] = br.readLine().split(" ");
        String s2[] = br.readLine().split(" ");

        int arr1[] = new int[n];
        int arr2[] = new int[n];

        arr1[0] = Integer.parseInt(s1[0]);
        arr2[0] = Integer.parseInt(s2[0]);

        for(int i = 1; i < n; i++) {
            arr1[i] = arr1[i - 1] + Integer.parseInt(s1[i]);
            arr2[i] = arr2[i - 1] + Integer.parseInt(s2[i]);
        }

        for(int i = n - 1; i >= 0; i--) {
            if(arr1[i] == arr2[i]) {
                k = i + 1;
                break;
            }
        }

        System.out.println(k);

    }
}
