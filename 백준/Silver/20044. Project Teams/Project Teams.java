import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String s[] = br.readLine().split(" ");
        int arr[] = new int[2*n];
        int arr2[] = new int[n];

        for(int i = 0; i < 2*n; i++) {
            arr[i] = Integer.parseInt(s[i]);
        }

        Arrays.sort(arr);

        for(int i = 0; i < n; i++) {
            arr2[i] = arr[i] + arr[arr.length - 1 - i];
        }

        Arrays.sort(arr2);

        System.out.println(arr2[0]);


    }
}
