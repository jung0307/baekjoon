package Q;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main1356 {

    public static void main(String[] args) throws IOException {

        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        String s1[] = s.split("");
        int n = Integer.parseInt(s);

        long fs = 1;
        long bs = 1;

        boolean tf = false;

        for(int i = 1; i < s1.length; i++) {

            for(int j = 0; j < s1.length; j++) {

                if(j >= i) {
                    bs = bs*Integer.parseInt(s1[j]);
                }else {
                    fs = fs*Integer.parseInt(s1[j]);
                }
            }

//            System.out.println("fs = " + fs);
//            System.out.println("bs = " + bs);

            if(bs == fs) {
                tf = true;
                break;
            }

            bs = 1;
            fs = 1;

        }

        if(tf == true) {
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }

    }
}
