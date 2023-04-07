package Q;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main10214 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < n; i++) {

            int[] arrY = new int[9];
            int[] arrK = new int[9];

            for(int j = 0; j < 9; j++) {
                String s[] = br.readLine().split(" ");
                int a = Integer.parseInt(s[0]);
                int b = Integer.parseInt(s[1]);

                arrY[j] = a;
                arrK[j] = b;
            }

            int sumY = 0;
            int sumK = 0;

            for(int j = 0; j < 9; j++) {
                sumY = sumY + arrY[j];
                sumK = sumK + arrK[j];
            }

            if(sumY > sumK) {
                sb.append("Yonsei\n");
            }else if(sumY < sumK) {
                sb.append("Korea\n");
            }else {
                sb.append("Draw\n");
            }

        }

        System.out.print(sb.toString());

    }
}
