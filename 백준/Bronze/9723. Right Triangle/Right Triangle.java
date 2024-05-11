import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++) {
            String s[] = br.readLine().split(" ");
            int arr[] = new int[3];

            arr[0] = Integer.parseInt(s[0]);
            arr[1] = Integer.parseInt(s[1]);
            arr[2] = Integer.parseInt(s[2]);

            Arrays.sort(arr);

            if(arr[2] * arr[2] == arr[1] * arr[1] + arr[0] * arr[0]) {
                sb.append("Case #"+ (i + 1) + ": YES\n");
            }else {
                sb.append("Case #"+ (i + 1) + ": NO\n");
            }

        }

        System.out.print(sb.toString());
    }
}
