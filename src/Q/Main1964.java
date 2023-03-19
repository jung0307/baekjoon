package Q;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main1964 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        long sum = 5;

        if(n == 1) {
            System.out.println(5);
        }else {
            for(int i = 1; i < n; i++) {

                sum = sum + (i+2) + 2*(i+1);

            }

            System.out.println(sum%45678);
        }

    }
}
