import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = "";
        int sum = 0;

        StringBuilder sb = new StringBuilder();

        while ( !(s = br.readLine()).equals("#") ) {

            for(int i = 0; i < s.length(); i++) {
                if(s.charAt(i) != ' ') {
                    sum = sum + (int)(s.charAt(i) - 64) * (i + 1);
                }
            }
            sb.append(sum + "\n");

            sum = 0;
        }

        System.out.print(sb.toString());


    }
}
