
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = "";
        StringBuilder sb = new StringBuilder();
        short n;
        short m;

        while ( !(s = br.readLine()).equals("0") ) {
            n = 0 ;
            m = 0;
            for(short i = 0; i < s.length(); i++) {
                n = (short) (n + Short.parseShort(Character.toString(s.charAt(i))));
            }

            while (Short.toString(n).length() != 1) {
                m = 0;
                for(short i = 0; i < Short.toString(n).length(); i++) {
                    m = (short) (m + Short.parseShort(Character.toString((n+"").charAt(i))));
                }

                n = m;
            }

            sb.append(n+"\n");
        }

        System.out.print(sb.toString());

    }
}
