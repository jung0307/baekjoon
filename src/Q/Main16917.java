package Q;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main16917 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s[] = br.readLine().split(" ");

        int A  = Integer.parseInt(s[0]);
        int B  = Integer.parseInt(s[1]);
        int C  = Integer.parseInt(s[2]);
        int X  = Integer.parseInt(s[3]);
        int Y  = Integer.parseInt(s[4]);

        if(Math.max(X , Y) == X) {
            if(X * A + Y * B >= C * 2*Y + (X-Y) * A) {
                if(C * 2*Y + (X-Y) * A >= 2*X * C) {
                    System.out.println(2*X * C);
                }else {
                    System.out.println(C * 2*Y + (X-Y) * A);
                }
            }else {
                if(X * A + Y * B >= 2*X * C) {
                    System.out.println(2*X * C);
                }else {
                    System.out.println(X * A + Y * B);
                }
            }
        }else {
            if(X * A + Y * B >= C * 2*X + (Y-X) * B) {
                if(C * 2*X + (Y-X) * B >= 2*Y * C) {
                    System.out.println(2*Y * C);
                }else {
                    System.out.println(C * 2*X + (Y-X) * B);
                }
            }else {
                if(X * A + Y * B >= 2*Y * C) {
                    System.out.println(2*Y * C);
                }else {
                    System.out.println(X * A + Y * B);
                }
            }
        }


    }
}
