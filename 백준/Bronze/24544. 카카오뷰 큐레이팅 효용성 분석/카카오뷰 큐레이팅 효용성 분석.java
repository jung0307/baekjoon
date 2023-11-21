import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int arrInt1[] = new int[n];
        int arrInt2[] = new int[n];

        String s1[] = br.readLine().split(" ");
        String s2[] = br.readLine().split(" ");

        int sum1 = 0;
        int sum2 = 0;

        for(int i = 0; i < n; i++) {
            arrInt1[i] = Integer.parseInt(s1[i]);
            arrInt2[i] = Integer.parseInt(s2[i]);

            sum1 = sum1 + arrInt1[i];

            if(arrInt2[i] == 0) {
                sum2 = sum2 + arrInt1[i];
            }
        }

        System.out.println(sum1);
        System.out.println(sum2);

    }
}
