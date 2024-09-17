import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        String s[] = br.readLine().split(" ");

        for(int i = 0; i < n; i++) {
            int a = Integer.parseInt(s[i]);
            if(a == 300) {
                sb.append("1");
            } else if (a >= 275) {
                sb.append("2");
            } else if (a >= 250) {
                sb.append("3");
            }else {
                sb.append("4");
            }

            if(i < n - 1) {
                sb.append(" ");
            }
        }

        System.out.print(sb.toString());

    }
}
