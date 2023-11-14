import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int arrA[][] = new int[n][n];
        int arrB[][] = new int[n][n];
        int arrC[][] = new int[n][n];

        int cnt = 0;

        for(int i = 0; i < n; i++) {
            String s[] = br.readLine().split(" ");

            for(int j = 0; j < n; j++) {
                arrA[i][j] = Integer.parseInt(s[j]);
            }
        }

        for(int i = 0; i < n; i++) {
            String s[] = br.readLine().split(" ");

            for(int j = 0; j < n; j++) {
                arrB[i][j] = Integer.parseInt(s[j]);
            }
        }

        for(int a = 0; a < n; a++) {
            for(int i = 0; i < n; i++) {
                for(int j = 0; j < n; j++) {
                    if(arrA[a][j] == 1 && arrB[j][i] == 1) {
                        arrC[a][i] = 1;
                        cnt++;
                        break;
                    }
                }
            }
        }


        System.out.println(cnt);

    }
}
