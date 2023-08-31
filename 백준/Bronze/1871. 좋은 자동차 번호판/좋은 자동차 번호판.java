import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < n; i++) {
            String s[] = br.readLine().split("-");

            int a = 0;
            int b = Integer.parseInt(s[1]);

            for(int j = 0; j < s[0].length(); j++) {
               int c = (int)(s[0].charAt(j)) - 65;

               a = a + (int)Math.pow(26 , 2 - j) * c;
            }

            if((int)Math.abs(a - b) <= 100) {
                sb.append("nice\n");
            }else {
                sb.append("not nice\n");
            }
        }

        System.out.print(sb.toString());

    }
}
