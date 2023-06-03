
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < n; i++) {
            int m = Integer.parseInt(br.readLine());

            String s[] = br.readLine().split(" ");
            int[] arrInt = new int[m];

            for(int j = 0; j < m; j++) {
                arrInt[j] = Integer.parseInt(s[j]);
            }

            Arrays.sort(arrInt);

            if(i == n - 1) {
                sb.append(arrInt[0] + " " + arrInt[arrInt.length - 1]);
            }else {
                sb.append(arrInt[0] + " " + arrInt[arrInt.length - 1] + "\n");
            }
        }

        System.out.print(sb.toString());

    }
}
