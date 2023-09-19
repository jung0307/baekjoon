import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = "";

        StringBuilder sb = new StringBuilder();

        while ( !(s = br.readLine()).equals("0") ) {
            int sum = 0;

            for(int i = 1; i <= Integer.parseInt(s); i++) {
                sum = sum + i;
            }

            sb.append(sum + "\n");
        }

        System.out.print(sb.toString());

    }
}
