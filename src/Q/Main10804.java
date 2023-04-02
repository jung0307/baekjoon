package Q;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main10804 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int arrInt[] = new int[20];

        for(int i = 0; i < 20; i++) {
            arrInt[i] = i+1;
        }

        for(int i = 0; i < 10; i++) {
            String s[] = br.readLine().split(" ");
            int a = Integer.parseInt(s[0]) - 1;
            int b = Integer.parseInt(s[1]) - 1;
            int c = 0;

            for(int j = a; j <= (a+b)/2; j++ ) {
                int tmp = arrInt[j];
                arrInt[j] = arrInt[b - c];
                arrInt[b - c] = tmp;
                c++;
             }
        }

        for(int i = 0; i < arrInt.length; i++) {
            System.out.print(arrInt[i] + " ");
        }

    }
}
