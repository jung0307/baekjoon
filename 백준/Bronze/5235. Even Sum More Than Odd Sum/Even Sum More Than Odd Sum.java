import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < n; i++) {
            String s[] = br.readLine().split(" ");
            int odd = 0;
            int even = 0;

            for(int j = 1; j < s.length; j++) {
                if(Integer.parseInt(s[j]) % 2 == 0) {
                    even = even + Integer.parseInt(s[j]);
                }else {
                    odd = odd + Integer.parseInt(s[j]);
                }
            }

            if(odd > even) {
                sb.append("ODD\n");
            } else if (even > odd) {
                sb.append("EVEN\n");
            }else {
                sb.append("TIE\n");
            }
        }

        System.out.print(sb.toString());

    }
}
