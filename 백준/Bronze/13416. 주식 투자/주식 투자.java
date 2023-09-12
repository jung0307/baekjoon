import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int arrInt[] = new int[3];

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < n; i++) {
            int m = Integer.parseInt(br.readLine());

            int sum = 0;

            for(int j = 0; j < m; j++) {
                String s[] = br.readLine().split(" ");

                int a = Integer.parseInt(s[0]);
                int b = Integer.parseInt(s[1]);
                int c = Integer.parseInt(s[2]);

                arrInt[0] = a;
                arrInt[1] = b;
                arrInt[2] = c;

                Arrays.sort(arrInt);

                if(arrInt[2] >= 0) {
                    sum = sum + arrInt[2];
                }
            }

            sb.append(sum+"\n");
        }

        System.out.print(sb.toString());

    }
}
