package Q;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2953 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = 0;
        int b = 0;

        for(int i = 0; i < 5; i++) {
            String s[] = br.readLine().split(" ");

            int sum = 0;

            for(int j = 0; j < s.length; j++) {
                sum = sum + Integer.parseInt(s[j]);
            }

            if(sum > b) {
                b = sum;
                a = i+1;
            }
        }

        System.out.print(a + " " + b);

    }
}
