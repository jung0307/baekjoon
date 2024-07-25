import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = "";
        StringBuilder sb = new StringBuilder();

        while ( !(s = br.readLine()).equals("-1") ) {
            int n = Integer.parseInt(s);
            int m = 1;
            ArrayList<Integer> arr = new ArrayList<>();

            while (n != m) {
                if(n % m == 0) {
                    arr.add(m);
                }
                m++;
            }

            int sum = 0;

            for(int i = 0; i < arr.size(); i++) {
                sum = sum + arr.get(i);
            }

            if(n == sum) {
                sb.append(n + " = ");
                for(int i = 0; i < arr.size() - 1; i++) {
                    sb.append(arr.get(i) + " + ");
                }
                sb.append(arr.get(arr.size() - 1) + "\n");
            }else {
                sb.append(n + " is NOT perfect.\n");
            }
        }

        System.out.print(sb.toString());

    }
}
