import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().split(" ");
        StringBuilder sb = new StringBuilder();

        int R = Integer.parseInt(s[0]);
        int C = Integer.parseInt(s[1]);
        int ZR = Integer.parseInt(s[2]);
        int ZC = Integer.parseInt(s[3]);

        String ss[][] = new String[R][C];

        for(int i = 0; i < R; i++) {
            String sss[] = br.readLine().split("");

            for(int j = 0; j < C; j++) {
                ss[i][j] = sss[j];
            }
        }

        for(int i = 0; i < R; i++) {
            for(int z = 0; z < ZR; z++) {
                for(int j = 0; j < C; j++) {
                    for(int l = 0; l < ZC; l++) {
                        sb.append(ss[i][j]);
                    }
                }
                sb.append("\n");
            }

        }

        System.out.print(sb.toString());
    }
}
