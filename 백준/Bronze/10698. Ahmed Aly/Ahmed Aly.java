import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < n; i++) {
            String s[] = br.readLine().split(" ");

            if(s[1].equals("+")) {
                if(Integer.parseInt(s[0]) + Integer.parseInt(s[2]) == Integer.parseInt(s[4])) {
                    sb.append("Case " + (i + 1) + ": YES\n");
                }else {
                    sb.append("Case " + (i + 1) + ": NO\n");
                }
            }else {
                if(Integer.parseInt(s[0]) - Integer.parseInt(s[2]) == Integer.parseInt(s[4])) {
                    sb.append("Case " + (i + 1) + ": YES\n");
                }else {
                    sb.append("Case " + (i + 1) + ": NO\n");
                }
            }
        }

        System.out.print(sb.toString());
    }
}
