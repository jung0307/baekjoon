package Q;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main1350 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        String s[] = br.readLine().split(" ");

        int cl = Integer.parseInt(br.readLine());
        long sum = 0;

        for(int i = 0; i < s.length; i++) {

            int file = Integer.parseInt(s[i]);

            int rm = file%cl;
            int sh = file/cl;

            if(sh > 0) {
                if(rm == 0) {
                    sum = sum + sh;
                }else {
                    sum = sum + sh + 1;
                }
            }else {
                if(rm > 0) {
                    sum = sum + 1;
                }
            }

        }

        System.out.println(sum * cl);

    }
}
