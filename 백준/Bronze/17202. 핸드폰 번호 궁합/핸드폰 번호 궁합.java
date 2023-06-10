
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s1[] = br.readLine().split("");
        String s2[] = br.readLine().split("");

        String s3 = "";

        int n = s1.length;


        for(int i = 0; i < n; i++) {
            s3 = s3 + s1[i] + s2[i];
        }

        String s4[] = s3.split("");

        int m = s4.length;

        String s5 = "";

        while (m != 2) {

            for(int i = 0; i < m - 1; i++) {
                int a = Integer.parseInt(s4[i]) + Integer.parseInt(s4[i + 1]);

                if(a >= 10) {
                    s5 = s5 + Integer.toString(a).charAt(1);
                }else {
                    s5 = s5 + Integer.toString(a);
                }
            }

            m = s5.length();
            s4 = s5.split("");

            if(m != 2) {
                s5 = "";
            }

        }

        System.out.println(s5);

    }
}
