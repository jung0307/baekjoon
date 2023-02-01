
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static Integer[][] arrInt2;
    static int[][] arrInt;
    static int n;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arrInt = new int[n][n];
        arrInt2 = new Integer[n][n];

        for(int i = 0; i < n; i++) {
            String s[] = br.readLine().split(" ");

            for(int j = 0; j <= i; j++) {
                arrInt[i][j] = Integer.parseInt(s[j]);
            }
        }

        for(int i = 0; i < n; i++) {
            arrInt2[n - 1][i] = arrInt[n - 1][i];
        }

        System.out.println(solution(0,0));
    }

    static int solution(int a , int b) {
        if(a == n - 1) {
            return arrInt2[a][b];
        }

        if(arrInt2[a][b] == null) {
            arrInt2[a][b] = Math.max(solution(a + 1, b) , solution(a + 1 , b + 1)) + arrInt[a][b];
        }

        return arrInt2[a][b];
    }
}
