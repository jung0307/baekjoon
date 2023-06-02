
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
            char c = ss[0].charAt(0);
            int n = (int)c;
            int sum = 0;

            for(int i = 1; i < ss.length; i++) {
                for(int j = 0; j < ss[i].length(); j++) {
                    if((int)ss[i].charAt(j) == n || (int)ss[i].charAt(j) == n - 32) {
                        sum++;
                    }
                }
            }

            sb.append(c+" "+sum+"\n");

        }

        System.out.print(sb.toString());

    }
}
