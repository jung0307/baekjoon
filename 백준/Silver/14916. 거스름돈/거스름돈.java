
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int a = 0;
//        int b = 0;
//        int c = 0;


        while (n >= 0) {

            if(n == 1 || n == 3) {
                a = -1;
                break;
            }

            if(n % 5 == 0) {
                a = a + n/5;
                //b = b + n/5;
                n = -1;
            }else {
                n = n - 2;
                a = a + 1;
                //c = c + 1;
            }

        }

        System.out.println(a);
//        System.out.println(b + " " + b*5);
//        System.out.println(c + " " + c*2);

    }
}
