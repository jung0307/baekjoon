package Q;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main10768 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());



        if(a == 2) {
            if (b > 18) {
                System.out.println("After");
            }else if(b == 18) {
                System.out.println("Special");
            }else {
                System.out.println("Before");
            }
        } else if (a < 2) {
            System.out.println("Before");
        }else {
            System.out.println("After");
        }

    }
}
