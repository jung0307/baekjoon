
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static int[][][] arrInt = new int[21][21][21];

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for(int i = 0; i < 21; i++) {
            for(int j = 0; j < 21; j++) {
                for(int k = 0; k < 21; k++) {
                    if(i == 0 || j == 0 || k == 0) {
                        arrInt[i][j][k] = 1;
                    }else if (i < j && j < k) {
                        arrInt[i][j][k] = arrInt[i][j][k-1] + arrInt[i][j-1][k-1] - arrInt[i][j-1][k];
                    }else {
                        arrInt[i][j][k] = arrInt[i-1][j][k] + arrInt[i-1][j-1][k] + arrInt[i-1][j][k-1] - arrInt[i-1][j-1][k-1];
                    }
                }
            }
        }

        String a = "";
        StringBuilder sb = new StringBuilder();
        while (!(a = br.readLine()).equals("-1 -1 -1")) {
            String[] s = a.split(" ");
            int[] arrInt2 = new int[3];
            boolean tf = false;

            for(int i = 0; i < s.length; i++) {
                arrInt2[i] = Integer.parseInt(s[i]);
            }

            if(arrInt2[0] <= 0 || arrInt2[1] <= 0 || arrInt2[2] <= 0 ) {
                tf = true;
            }

            if(arrInt2[0] > 20 || arrInt2[1] > 20 || arrInt2[2] > 20) {
                arrInt2[0] = 20;
                arrInt2[1] = 20;
                arrInt2[2] = 20;
            }


            if(tf == true) {
                sb.append("w("+s[0]+", "+s[1]+", "+s[2]+") = 1\n");
            }else {
                sb.append("w("+s[0]+", "+s[1]+", "+s[2]+") = "+ arrInt[arrInt2[0]][arrInt2[1]][arrInt2[2]]+"\n");
            }

        }

        System.out.print(sb.toString());

    }
}