
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = "";
        StringBuilder sb = new StringBuilder();
        int i = 1;

        while (!(s = br.readLine()).contains("E")) {

            String ss[] = s.split(" ");

            int a = Integer.parseInt(ss[0]);
            int b = Integer.parseInt(ss[2]);

            switch (ss[1]) {
                case ">" : if(a > b) {
                    sb.append("Case " + (i++) + ": true\n");
                }else {
                    sb.append("Case " + (i++) + ": false\n");
                }
                break;

                case ">=" : if(a >= b) {
                    sb.append("Case " + (i++) + ": true\n");
                }else {
                    sb.append("Case " + (i++) + ": false\n");
                }
                    break;

                case "<" : if(a < b) {
                    sb.append("Case " + (i++) + ": true\n");
                }else {
                    sb.append("Case " + (i++) + ": false\n");
                }
                    break;

                case "<=" : if(a <= b) {
                    sb.append("Case " + (i++) + ": true\n");
                }else {
                    sb.append("Case " + (i++) + ": false\n");
                }
                    break;

                case "==" : if(a == b) {
                    sb.append("Case " + (i++) + ": true\n");
                }else {
                    sb.append("Case " + (i++) + ": false\n");
                }
                    break;

                case "!=" : if(a != b) {
                    sb.append("Case " + (i++) + ": true\n");
                }else {
                    sb.append("Case " + (i++) + ": false\n");
                }
                    break;
            }

        }

        System.out.print(sb.toString());

    }
}
