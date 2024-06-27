import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String s[] = br.readLine().split(" ");

        int n = Integer.parseInt(s[0]);
        int w = Integer.parseInt(s[1]);
        int h = Integer.parseInt(s[2]);
        int d = (int)Math.sqrt((Math.pow(w , 2) + Math.pow(h , 2)));

        for(int i = 0; i < n; i++) {
            int a = Integer.parseInt(br.readLine());

            if(a <= d) {
                sb.append("YES\n");
            }else {
                sb.append("NO\n");
            }
        }
            System.out.print(sb.toString());
    }
}
