package Q;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main4892 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = "";
        StringBuilder sb = new StringBuilder();
        int i = 0;

        while (!(s = br.readLine()).equals("0")) {
            i++;
            int n0 = Integer.parseInt(s);

            int n1 = n0 * 3;
            int n2 = 0;

            boolean tf = false;

            if(n1 % 2 == 0) {
                n2 = n1/2;
            }else {
                n2 = (n1+1)/2;
                tf = true;
            }

            int n3 = 3*n2;
            int n4 = n3/9;

            if(tf == false) {
                sb.append(i + ". even " + n4+"\n");
            }else {
                sb.append(i + ". odd " + n4+"\n");
            }
        }

        System.out.print(sb.toString());

    }
}
