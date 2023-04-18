package Q;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main1773 {


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s1[] = br.readLine().split(" ");

        int sn = Integer.parseInt(s1[0]);
        int et = Integer.parseInt(s1[1]);

        Boolean[] arrBoo = new Boolean[et+1];

        for(int i = 0; i < sn; i++) {
            int cycle = Integer.parseInt(br.readLine());
            int k = 1;

            for(int j = cycle; j <= et; j = cycle*k) {
                arrBoo[j] = true;
                k++;
            }
        }

        int sum = 0;

        for(int i = 0; i < arrBoo.length; i++) {
            if(arrBoo[i] != null) {
                sum++;
            }
        }

        System.out.println(sum);
    }

}
