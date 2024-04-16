import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = "";

        StringBuilder sb = new StringBuilder();

        while ( !(s = br.readLine()).equals("#") ) {

            String ss[] = s.split("");

            int vote[] = new int[4];

            for(int i = 0; i < ss.length; i++) {
                if(ss[i].equals("Y")) {
                    vote[0]++;
                }
                else if (ss[i].equals("N")) {
                    vote[1]++;
                }
                else if (ss[i].equals("P")) {
                    vote[2]++;
                }
                else if (ss[i].equals("A")) {
                    vote[3]++;
                }
            }

            if(vote[0] + vote[1] + vote[2] <= vote[3]) {
                sb.append("need quorum\n");
            } else {

                if(vote[0] > vote[1]) {
                    sb.append("yes\n");
                } else if (vote[0] < vote[1]) {
                    sb.append("no\n");

                }else {
                    sb.append("tie\n");
                }

            }

        }

        System.out.print(sb.toString());

    }
}
