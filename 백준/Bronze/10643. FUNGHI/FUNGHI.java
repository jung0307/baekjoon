import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int arr[] = new int[8];
        int arr2[] = new int[8];

        for(int i = 0; i < 8; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        for(int i = 0; i <= 4; i++) {
            arr2[i] = arr[i] + arr[i + 1] + arr[i + 2] + arr[i + 3];
        }

        arr2[5] = arr[5] + arr[6] + arr[7] + arr[0];
        arr2[6] = arr[6] + arr[7] + arr[0] + arr[1];
        arr2[7] = arr[7] + arr[0] + arr[1] + arr[2];

        Arrays.sort(arr2);

        System.out.println(arr2[7]);

    }
}
