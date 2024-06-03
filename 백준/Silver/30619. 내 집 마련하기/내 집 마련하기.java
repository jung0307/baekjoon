import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        String arr_s[] = br.readLine().split(" ");
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < n; i++) {
            String s[] = br.readLine().split(" ");
            int a = Integer.parseInt(s[0]);
            int a2 = Integer.parseInt(s[0]);
            int b = Integer.parseInt(s[1]);
            int arr_int[] = new int[arr_s.length];
            int arr_int2[] = new int[b - a + 1];
            int k = 0;

            for(int j = 0; j < arr_int2.length; j++) {
                arr_int2[j] = a2;
                a2++;
            }

            Arrays.sort(arr_int2);

            for(int j = 0; j < arr_s.length; j++) {
                arr_int[j] = Integer.parseInt(arr_s[j]);
            }

            for(int j = 0; j < arr_s.length; j++) {
                if(Integer.parseInt(arr_s[j]) >= a && Integer.parseInt(arr_s[j]) <= b) {
                    arr_int[j] = arr_int2[k++];
                }
            }

            for(int j = 0; j < arr_int.length; j++) {
                sb.append(arr_int[j] + " ");
            }

            sb.append("\n");
        }

        System.out.print(sb.toString());
    }
}
