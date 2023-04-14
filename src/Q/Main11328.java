package Q;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main11328 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        // 97 122

        for(int i = 0; i < n; i++) {
            String s[] = br.readLine().split(" ");
            int arrInt1[] = new int[26];
            int arrInt2[] = new int[26];

            for(int j = 0; j < s[0].length(); j++) {
                arrInt1[(int)(s[0].charAt(j) - 97)]++;
            }
            for(int j = 0; j < s[1].length(); j++) {
                arrInt2[(int)(s[1].charAt(j) - 97)]++;
            }

            boolean tf = false;

            for(int j = 0; j <26; j++) {
                if(arrInt1[j] != arrInt2[j]) {
                    tf = true;
                    break;
                }
            }

            if(tf == false) {
                sb.append("Possible\n");
            }else {
                sb.append("Impossible\n");
            }

        }

        System.out.print(sb.toString());

    }
}
