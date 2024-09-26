import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        int arr[] = new int[n];

        for(int i = 0; i < n; i++) {
            String s[] = br.readLine().split(" ");

            arr[i] = Integer.parseInt(s[0]) + Integer.parseInt(s[1]);
        }

        Arrays.sort(arr);

        System.out.println(arr[0]);


    }
}
