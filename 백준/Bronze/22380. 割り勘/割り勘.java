import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = "";
        StringBuilder sb = new StringBuilder();

        while ( !(s = br.readLine()).equals("0 0") ) {
            String s1[] = s.split(" ");
            String s2[] = br.readLine().split(" ");

            int a = Integer.parseInt(s1[1]) / Integer.parseInt(s1[0]);
            int sum = 0;

            for(int i = 0; i < s2.length; i++) {
                if(Integer.parseInt(s2[i]) >= a) {
                    sum = sum + a;
                }else {
                    sum = sum + Integer.parseInt(s2[i]);
                }
            }

            sb.append(sum + "\n");
        }

        System.out.print(sb.toString());

    }
}
