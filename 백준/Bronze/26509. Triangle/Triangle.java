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
            String s1[] = br.readLine().split(" ");
            String s2[] = br.readLine().split(" ");

            int arr1[] = {Integer.parseInt(s1[0]) , Integer.parseInt(s1[1]) , Integer.parseInt(s1[2])};
            int arr2[] = {Integer.parseInt(s2[0]) , Integer.parseInt(s2[1]) , Integer.parseInt(s2[2])};

            Arrays.sort(arr1);
            Arrays.sort(arr2);

            if(arr1[2] * arr1[2] == arr1[1] * arr1[1] + arr1[0] * arr1[0] && arr2[2] * arr2[2] == arr2[1] * arr2[1] + arr2[0] * arr2[0]) {
                if(arr1[0] + arr1[1] == arr2[0] + arr2[1]) {
                    sb.append("YES\n");
                }else {
                    sb.append("NO\n");
                }
            }else {
                sb.append("NO\n");
            }
        }

        System.out.print(sb.toString());

    }
}