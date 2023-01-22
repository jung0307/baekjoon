
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arrInt = new int[n][3];

        String s[] = br.readLine().split(" ");
        int a = Integer.parseInt(s[0]);
        int b = Integer.parseInt(s[1]);
        int c = Integer.parseInt(s[2]);

        arrInt[0][0] = a;
        arrInt[0][1] = b;
        arrInt[0][2] = c;

        for(int i = 1; i < n; i++) {
            s = br.readLine().split(" ");
            a = Integer.parseInt(s[0]);
            b = Integer.parseInt(s[1]);
            c = Integer.parseInt(s[2]);
            
            arrInt[i][0] = a + Math.min(arrInt[i-1][1] , arrInt[i-1][2]);
            arrInt[i][1] = b + Math.min(arrInt[i-1][0] , arrInt[i-1][2]);
            arrInt[i][2] = c + Math.min(arrInt[i-1][0] , arrInt[i-1][1]);

        }

        int[] arrInt2 = new int[3];
        arrInt2[0] = arrInt[arrInt.length-1][0];
        arrInt2[1] = arrInt[arrInt.length-1][1];
        arrInt2[2] = arrInt[arrInt.length-1][2];

        Arrays.sort(arrInt2);

        System.out.println(arrInt2[0]);

    }
}
