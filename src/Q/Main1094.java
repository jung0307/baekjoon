package Q;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main1094 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int x = Integer.parseInt(br.readLine());

        int s = 64;
        int sum = 64;
        int a = 1;

        while (sum != x) {
            if(sum > x) {
                s = s/2;
                a++;
                if(sum - s >= x) {
                    sum = sum - s;
                    a--;
                }
            }
        }

        System.out.println(a);

    }
}
