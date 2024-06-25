import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < n; i++) {
            String s[] = br.readLine().split("");
            int a = (int)(Math.sqrt(s.length));

            String ss[][] = new String[a][a];
            String yy[][] = new String[a][a];

            int b = 0;

            for(int j = 0; j < a; j++) {
                for(int k = 0; k < a; k++) {
                    ss[j][k] = s[b++];
                }
            }

            for(int j = 0; j < a; j++) {
                for(int k = 0; k < a; k++) {
                    yy[j][k] = ss[k][a - j - 1];
                }
            }

            for(int j = 0; j < a; j++) {
                for(int k = 0; k < a; k++) {
                    sb.append(yy[j][k]);
                }
            }
            sb.append("\n");
        }

        System.out.print(sb.toString());


    }
}
