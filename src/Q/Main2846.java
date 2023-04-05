package Q;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2846 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        String s[] = br.readLine().split(" ");
        int[] arrInt = new int[n];

        for(int i = 0; i < s.length; i++) {
            arrInt[i] = Integer.parseInt(s[i]);
        }

        int h = 0;
        int sum = 0;

        for(int i = 0; i < arrInt.length - 1; i++) {

            if(arrInt[i+1] - arrInt[i] > 0) {
                h = h + arrInt[i+1] - arrInt[i];

                if(sum < h) {
                    sum = h;
                }

            }else {
                h = 0;
            }

        }

        System.out.println(sum);

    }
}
