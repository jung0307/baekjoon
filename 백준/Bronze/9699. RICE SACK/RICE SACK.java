import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < n; i++) {
            String s[] = br.readLine().split(" ");
            int arr[] = new int[s.length];

            for(int j = 0; j < s.length; j++) {
                arr[j] = Integer.parseInt(s[j]);
            }

            Arrays.sort(arr);

            sb.append("Case #" + (i + 1) + ": "+ arr[s.length - 1] + "\n");
        }

        System.out.print(sb.toString());


    }
}
