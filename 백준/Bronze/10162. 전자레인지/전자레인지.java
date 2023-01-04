
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int a = 0;
        int b = 0;
        int c = 0;
        int d = -1;
        boolean tf = false;

        while (n > 0) {

            if(n >= 300) {
                n = n - 300;
                a++;
            }else if(n >= 60) {
                n = n - 60;
                b++;
            }else if(n >= 10) {
                n = n - 10;
                c++;
            }

            if(0 < n && n < 10) {
                tf = true;
                break;
            }

        }

        if(tf == true) {
            System.out.println(d);
        }else {
            System.out.println(a+" "+b+" "+c);
        }


    }
}
