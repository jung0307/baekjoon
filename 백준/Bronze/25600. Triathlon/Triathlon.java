import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int score = 0;
        int arr[] = new int[n];

        for(int i = 0; i < n; i++) {
            String s[] = br.readLine().split(" ");

            int a = Integer.parseInt(s[0]);
            int d = Integer.parseInt(s[1]);
            int g = Integer.parseInt(s[2]);

            if(a == (d + g)) {
                score = 2 * (a * (d + g));
            }else {
                score = a * (d + g);
            }
            arr[i] = score;
        }

        Arrays.sort(arr);

        System.out.println(arr[arr.length - 1]);

    }
}
