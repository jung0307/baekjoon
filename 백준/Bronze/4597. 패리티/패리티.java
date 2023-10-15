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
            int o = 0;

            for(int i = 0; i < ss.length - 1; i++) {
                if(Integer.parseInt(ss[i]) == 1) {
                    o++;
                }
                sss = sss + ss[i];
            }

            if(ss[ss.length - 1].equals("o")) {
                if(o % 2 == 0) {
                    sb.append(sss + "1\n");
                }else {
                    sb.append(sss + "0\n");
                }
            }else {
                if(o % 2 == 0) {
                    sb.append(sss + "0\n");
                }else {
                    sb.append(sss + "1\n");
                }
            }
        }

        System.out.print(sb.toString());

    }
}
