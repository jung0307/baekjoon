import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s[] = br.readLine().split(" ");
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(s[0]);
        int M = Integer.parseInt(s[1]);

        String arr[][] = new String[N][M];

        for(int i = 0; i < N; i++) {
            String ss[] = br.readLine().split("");
            int a = M - 1;

            for(int j = 0; j < ss.length; j++) {
                if(!ss[j].equals(".")) {
                    arr[i][j] = ss[j];
                    arr[i][M - 1 - j] = ss[j];
                }
            }

            for(int j = 0; j < ss.length; j++) {
                if(arr[i][j] == null) {
                    arr[i][j] = ".";
                }

                sb.append(arr[i][j]);
            }

            sb.append("\n");
        }

        System.out.print(sb.toString());

    }
}
