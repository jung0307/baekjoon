import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().split(" ");

        int n = Integer.parseInt(br.readLine());
        int m = 0;
        int arrInt[] = new int[n];
        int sum = 0;

        for(int i = 1; i <= 3 * n; i++) {
            String ss[] = br.readLine().split(" ");

            for(int j = 0; j < 3; j++) {
                sum = sum + Integer.parseInt(s[j]) * Integer.parseInt(ss[j]);
            }

            if(i % 3 == 0) {
                arrInt[m++] = sum;
                sum = 0;
            }
        }

        Arrays.sort(arrInt);

        System.out.println(arrInt[arrInt.length - 1]);

    }
}
