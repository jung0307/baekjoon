import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String s = "";

        while ( !(s = br.readLine()).equals("0") ) {

            if(s.length() == 1) {
                sb.append(s + "\n");
            }else {
                while (s.length() > 1) {
                    sb.append(s + " ");
                    String ss[] = s.split("");
                    int a = 1;

                    for(int i = 0; i < ss.length; i++) {
                        a = a * Integer.parseInt(ss[i]);
                    }
                    s = a + "";
                }

                sb.append(s + " \n");
            }

        }

        System.out.print(sb.toString());

    }
}
