import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s1[] = br.readLine().split(" ");

        int n = Integer.parseInt(s1[0]);
        int m = Integer.parseInt(s1[1]);

        int arrInt[] = new int[n];

        for(int i = 0; i < m; i++) {
            String s2[] = br.readLine().split(" ");

            int a = Integer.parseInt(s2[0]);
            int b = Integer.parseInt(s2[1]);
            int c = Integer.parseInt(s2[2]);

            for(int j = a - 1; j <= b - 1; j++) {
                arrInt[j] = c;
            }
        }

        for(int i = 0; i < arrInt.length; i++) {
            System.out.print(arrInt[i] + " ");
        }

    }
}
