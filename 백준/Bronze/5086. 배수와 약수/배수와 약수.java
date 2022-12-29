
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s;
        StringBuilder sb = new StringBuilder();
        while ( !(s = br.readLine()).equals("0 0") ) {
            String[] arr = s.split(" ");
            int n = Integer.parseInt(arr[0]);
            int m = Integer.parseInt(arr[1]);

            if(m%n == 0) {
                sb.append("factor\n");
            }else if(n%m == 0) {
                sb.append("multiple\n");
            }else{
                sb.append("neither\n");
            }
        }

        System.out.print(sb.toString());
    }
}
