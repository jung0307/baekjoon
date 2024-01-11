import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = "";
        StringBuilder sb = new StringBuilder();

        while ( !(s = br.readLine()).equals("#") ) {

            String ss[] = s.split(" ");

            for(int i = 0; i < ss.length; i++) {
                String sss[] = ss[i].split("");

                for(int j = 0; j < sss.length / 2; j++) {
                    String temp = sss[j];
                    sss[j] = sss[sss.length - 1 - j];
                    sss[sss.length - 1 - j] = temp;
                }

                for(int j = 0; j < sss.length; j++) {
                    sb.append(sss[j]);
                }
                sb.append(" ");

             }

            sb.append("\n");

        }

        System.out.print(sb.toString());

    }
}
