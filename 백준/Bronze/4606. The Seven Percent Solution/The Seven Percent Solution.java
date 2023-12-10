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
            String sss = "";

            for(int i = 0; i < ss.length; i++) {
                if(ss[i].equals(" ")) {
                    ss[i] = "%20";
                } else if (ss[i].equals("!")) {
                    ss[i] = "%21";
                } else if (ss[i].equals("$")) {
                    ss[i] = "%24";
                } else if (ss[i].equals("%")) {
                    ss[i] = "%25";
                } else if (ss[i].equals("(")) {
                    ss[i] = "%28";
                } else if (ss[i].equals(")")) {
                    ss[i] = "%29";
                } else if (ss[i].equals("*")) {
                    ss[i] = "%2a";
                }
                sss = sss + ss[i];
            }

            sb.append(sss + "\n");
        }

        System.out.print(sb.toString());

    }
}
