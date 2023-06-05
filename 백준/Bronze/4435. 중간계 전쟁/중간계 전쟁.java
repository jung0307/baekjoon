

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < n; i++) {
            String s1[] = br.readLine().split(" ");
            String s2[] = br.readLine().split(" ");

            int sum1 = 0;
            int sum2 = 0;

            for(int j = 0; j < s1.length; j++) {
                if(j == 0) {
                    sum1 = sum1 + Integer.parseInt(s1[j]) * 1;
                } else if (j == 1) {
                    sum1 = sum1 + Integer.parseInt(s1[j]) * 2;
                } else if (j == 2) {
                    sum1 = sum1 + Integer.parseInt(s1[j]) * 3;
                } else if (j == 3) {
                    sum1 = sum1 + Integer.parseInt(s1[j]) * 3;
                } else if (j == 4) {
                    sum1 = sum1 + Integer.parseInt(s1[j]) * 4;
                } else if (j == 5) {
                    sum1 = sum1 + Integer.parseInt(s1[j]) * 10;
                }
            }
            for(int j = 0; j < s2.length; j++) {
                if(j == 0) {
                    sum2 = sum2 + Integer.parseInt(s2[j]) * 1;
                } else if (j == 1) {
                    sum2 = sum2 + Integer.parseInt(s2[j]) * 2;
                } else if (j == 2) {
                    sum2 = sum2 + Integer.parseInt(s2[j]) * 2;
                } else if (j == 3) {
                    sum2 = sum2 + Integer.parseInt(s2[j]) * 2;
                } else if (j == 4) {
                    sum2 = sum2 + Integer.parseInt(s2[j]) * 3;
                } else if (j == 5) {
                    sum2 = sum2 + Integer.parseInt(s2[j]) * 5;
                } else if (j == 6) {
                    sum2 = sum2 + Integer.parseInt(s2[j]) * 10;
                }
            }

            if(sum1 > sum2) {
                sb.append("Battle "+(i+1)+": Good triumphs over Evil\n");
            } else if (sum1 == sum2) {
                sb.append("Battle "+(i+1)+": No victor on this battle field\n");
            }else {
                sb.append("Battle "+(i+1)+": Evil eradicates all trace of Good\n");
            }
        }

        System.out.print(sb.toString());

    }
}
