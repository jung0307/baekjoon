import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = "";

        StringBuilder sb = new StringBuilder();

        while ( !(s = br.readLine()).equals("-1") ) {
            int n = Integer.parseInt(s.trim());
            int mile = 0;

            int arrT[] = new int[n];

            for(int i = 0; i < n; i++) {
                String ss[] = br.readLine().split(" ");
                arrT[i] = Integer.parseInt(ss[1]);

                if(i == 0) {
                    mile = mile + Integer.parseInt(ss[0]) * arrT[i];
                }else {
                    mile = mile + Integer.parseInt(ss[0]) * (arrT[i] - arrT[i - 1]);
                }

            }

            sb.append(mile + " miles\n");
        }

        System.out.print(sb.toString());

    }
}
