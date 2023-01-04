

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = 1000 - n;
        int count = 0;

        while (m > 0) {
//            System.out.println(m);
            if(m >= 500) {
                m = m - 500;
            }else if(m >= 100) {
                m = m - 100;
            }else if(m >= 50) {
                m = m - 50;
            }else if(m >= 10) {
                m = m - 10;
            }else if(m >= 5) {
                m = m - 5;
            }else if(m >= 1) {
                m = m - 1;
            }
            count++;
        }

        System.out.println(count);

    }
}
