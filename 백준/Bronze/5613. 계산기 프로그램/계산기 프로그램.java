import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = "";
        int a = 2;
        int b = Integer.parseInt(br.readLine());
        int c = 0;

        int sign = 0;

        while ( !(s = br.readLine()).equals("=") ) {
            if(a % 2 == 1) {
                c = Integer.parseInt(s);
                if(sign == 0) {
                    b = b + c;
                } else if (sign == 1) {
                    b = b - c;
                } else if (sign == 2) {
                    b = b * c;
                }else {
                    b = b / c;
                }

            }else {
                if(s.equals("+")) {
                    sign = 0;
                } else if (s.equals("-")) {
                    sign = 1;
                } else if (s.equals("*")) {
                    sign = 2;
                }else {
                    sign = 3;
                }
            }
            a++;
        }

        System.out.println(b);

    }
}
