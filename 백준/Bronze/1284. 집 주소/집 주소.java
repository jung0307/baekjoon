
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = "";
        StringBuilder sb = new StringBuilder();

        while ( !(s = br.readLine()).equals("0") ) {

            int n = s.split("").length;
            int sum = 0;

            for(int i = 0; i < n; i++) {
                if(s.charAt(i) == '0') {
                    sum = sum + 4;
                }else if(s.charAt(i) == '1') {
                    sum = sum + 2;
                }else {
                    sum = sum + 3;
                }
            }

            sb.append(sum+2+n-1+"\n");

        }

        System.out.print(sb.toString());

    }
}
