package Q;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main15921 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        if(n == 0) {
            System.out.println("divide by zero");
        }else {
            String s[] = br.readLine().split(" ");
            float med = 0;
            float ev = 0;

            for(int i  = 0; i < n; i++) {
                med = med + Integer.parseInt(s[i]);
                ev = ev + (float)1/n * Integer.parseInt(s[i]);
            }

            med = med / n;

            System.out.println(String.format("%.2f" , med/ev));
        }



    }
}
