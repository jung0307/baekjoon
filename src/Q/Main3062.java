package Q;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main3062 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < n; i++) {
            String s[] = br.readLine().split("");
            String ss[] = new String[s.length];

            for(int j = 0 ; j < s.length; j++) {
                ss[j] = s[s.length-1 - j];
            }

            String y = "";
            String yy = "";

            for(int j = 0; j < s.length; j++) {
                y = y + s[j];
                yy = yy + ss[j];
            }

            String yyy = (Integer.parseInt(y) + Integer.parseInt(yy)) + "";

            String sss[] = yyy.split("");

            boolean tf = false;

            for(int j = 0; j < sss.length/2; j++) {
                if(!sss[j].equals(sss[sss.length-1-j])) {
                    tf = true;
                    break;
                }
            }

            //sb.append(y + " " + yy + " " + yyy + " ");

            if(tf == false) {
                sb.append("YES\n");
            }else {
                sb.append("NO\n");
            }
        }

        System.out.print(sb.toString());

    }
}
