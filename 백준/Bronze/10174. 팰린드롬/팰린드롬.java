
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < n; i++) {
            String s[] = br.readLine().toUpperCase().split("");
            boolean tf = false;

            for(int j = 0; j < s.length/2; j++) {
                if(!s[j].equals(s[s.length - 1 - j])) {
                    tf = true;
                    break;
                }
            }

            if(tf == false) {
                sb.append("Yes\n");
            }else {
                sb.append("No\n");
            }

        }

        System.out.print(sb.toString());

    }
}
