
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        String s = "";
        StringBuilder sb = new StringBuilder();

        while ( !(s = br.readLine()).equals("0") ) {

            int m = Integer.parseInt(s);

            if(m%n == 0) {
                sb.append(m+" is a multiple of "+n+".\n");
            }else {
                sb.append(m+" is NOT a multiple of "+n+".\n");

            }

        }

        System.out.print(sb.toString());

    }
}
